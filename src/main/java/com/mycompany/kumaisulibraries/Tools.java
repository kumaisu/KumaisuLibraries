/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kumaisulibraries;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

/**
 *
 * @author sugichan
 */
public final class Tools {

    public static enum consoleMode { none, normal, full, max, stop }
    public static Map< String, consoleMode > consoleFlag = new HashMap<>();

    public static void entryDebugFlag( String programCode, consoleMode key ) {
        consoleFlag.put( programCode, key );
    }

    /**
     * 一時的にDebugModeを設定しなおす
     *
     * @param key 
     * @param programCode 
     */
    public static void setDebug( String key, String programCode ) {
        try {
            consoleFlag.put( programCode, consoleMode.valueOf( key ) );
        } catch( IllegalArgumentException e ) {
            consoleFlag.put( programCode, consoleMode.none );
        }
    }

    /**
     * keyに対して、設定されているDebugMode下での可否判定を返す
     *
     * @param key
     * @param programCode
     * @return 
     */
    public static boolean isDebugFlag( consoleMode key, String programCode ) {
        return ( consoleFlag.get( programCode ).ordinal() >= key.ordinal() );
    }

    /**
     * メッセージ表示
     * @param player    表示するプレイヤー
     * @param msg       表示内容
     * @param key       システムコンソールに表示するか？
     * @param programCode
     */
    public static void Prt( Player player, String msg, consoleMode key, String programCode ) {
        if ( isDebugFlag( key, programCode ) ) {
            String printString = Utility.StringBuild( ChatColor.YELLOW.toString(), "(", programCode, ")" );
            if ( key != consoleMode.none ) { printString = Utility.StringBuild( printString, ":", key.toString(), " " ); }
            if ( player != null ) { printString = Utility.StringBuild( printString, player.getDisplayName(), " " ); }
            printString = Utility.StringBuild( printString, ChatColor.WHITE.toString(), msg );
            Bukkit.getServer().getConsoleSender().sendMessage( printString );
        }
        if ( player != null ) player.sendMessage( msg.split( "/n" ) );
    }

    public static void Prt( String msg, String programCode ) {
        Prt( ( Player ) null, msg, consoleMode.none, programCode );
    }

    public static void Prt( String msg, consoleMode key, String programCode ) {
        Prt( ( Player ) null, msg, key, programCode );
    }

    public static void Prt( Player player, String msg, String programCode ) {
        Prt( player, msg, ( ( player == null ) ? consoleMode.none:consoleMode.stop ), programCode );
    }

    /**
     * Config.ymlで指定されたコンソールコマンドを実行する
     *
     * @param player
     * @param ExecCommand
     * @param Message
     */
    public static void ExecOtherCommand( Player player, String ExecCommand, String Message ) {
        ExecCommand = ExecCommand.replace( "%message%", Message );
        ExecCommand = ExecCommand.replace( "%player%", player.getDisplayName() );
        Bukkit.getServer().dispatchCommand( Bukkit.getConsoleSender(), ExecCommand );
    }
}
