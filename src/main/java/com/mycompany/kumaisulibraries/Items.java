/*
 *  Copyright (c) 2019 sugichan. All rights reserved.
 */
package com.mycompany.kumaisulibraries;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.enchantments.Enchantment;

/**
 * 各プラグイン共通の関数群.....にするつもりのもの
 *
 * @author sugichan
 */
public final class Items {

    /**
     * サーバー独自アイテム「ExpCube」生成
     *
     * @param item
     * @return
     */
    public static ItemStack ExpCube( ItemStack item ) {
        List<String> lores = new ArrayList();

        lores.add( "§eスニーク§fしながら" );
        lores.add( "§b右クリック§fで貯める" );
        lores.add( "§b左クリック§fで取り出す" );

        ItemMeta im = item.getItemMeta();   //ItemStackから、ItemMetaを取得します。
        im.setDisplayName( "§aExpCube" );  //Item名を設定
        im.setLore( lores );                //loreを設定します。
        im.addItemFlags( ItemFlag.HIDE_ENCHANTS );
        item.setItemMeta(im);               //元のItemStackに、変更したItemMetaを設定します。

        item.addUnsafeEnchantment( Enchantment.PROTECTION_ENVIRONMENTAL, 0 );

        return item;
    }

    /**
     * サーバー独自アイテム「くまそうる」生成
     *
     * @param item
     * @return
     */
    public static ItemStack KumaSoul( ItemStack item ) {
        List<String> lores = new ArrayList();

        lores.add( "§dクマイス§eの§4魂§eが集まったもの" );
        lores.add( "§1デイリー§eで貰えるよ" );
        lores.add( "§e９つ集まるとオーブと交換できる" );

        ItemMeta im = item.getItemMeta();   //ItemStackから、ItemMetaを取得します。
        im.setDisplayName( "§aくまそうる" );  //Item名を設定
        im.setLore( lores );                //loreを設定します。
        im.addItemFlags( ItemFlag.HIDE_ENCHANTS );
        item.setItemMeta(im);               //元のItemStackに、変更したItemMetaを設定します。

        item.addUnsafeEnchantment( Enchantment.PROTECTION_ENVIRONMENTAL, 0 );

        return item;
    }

    /**
     * サーバー独自アイテム「くまおーぶ」生成
     *
     * @param item
     * @return
     */
    public static ItemStack KumaOrb( ItemStack item ) {
        List<String> lores = new ArrayList();

        lores.add( "§dクマイス§eから§4投票§eへの" );
        lores.add( "§e感謝のお礼として貰えるアイテム" );
        lores.add( "§eガチャがひけるよ！§d ❤" );

        ItemMeta im = item.getItemMeta();   //ItemStackから、ItemMetaを取得します。
        im.setDisplayName( "§a§lくまおーぶ" );  //Item名を設定
        im.setLore( lores );                //loreを設定します。
        im.addItemFlags( ItemFlag.HIDE_ENCHANTS );
        item.setItemMeta(im);               //元のItemStackに、変更したItemMetaを設定します。

        item.addUnsafeEnchantment( Enchantment.PROTECTION_ENVIRONMENTAL, 0 );

        return item;
    }

    public static ItemStack PresentArmor() {
        ItemStack is = new ItemStack( Material.CHAINMAIL_BOOTS, 1 );    // ChainMail Boots

        List<String> lores = new ArrayList();

        lores.add( "§7落下耐性 Ⅴ" );
        lores.add( "§7火炎耐性 Ⅴ" );
        lores.add( "§7耐久力 Ⅲ" );
        lores.add( "§d整地イベント参加賞" );

        ItemMeta im = is.getItemMeta();             //ItemStackから、ItemMetaを取得
        im.setDisplayName( "§bイベントブーツ" );    //Item名を設定
        im.setLore( lores );                        //loreを設定します。
        im.addItemFlags( ItemFlag.HIDE_ENCHANTS );  //本来のエンチャント情報を隠す
        is.setItemMeta( im );                       //元のItemStackに、変更したItemMetaを設定

        is.addUnsafeEnchantment( Enchantment.PROTECTION_FALL, 5 );      // Featherfall
        is.addUnsafeEnchantment( Enchantment.PROTECTION_FIRE, 5 );      // ProtectionFire
        is.addUnsafeEnchantment( Enchantment.DURABILITY, 3 );           // Unbreaking
        is.addUnsafeEnchantment( Enchantment.ARROW_INFINITE, 0 );       // Infinity

        return is;
    }

    public static ItemStack EventTool( String ToolName, Material tool, boolean full ) {
        ItemStack is = new ItemStack( tool, 1 );

        List<String> lores = new ArrayList();

        if ( full ) {
            is.addUnsafeEnchantment( Enchantment.DIG_SPEED, 10 );           // Efficiency
            is.addUnsafeEnchantment( Enchantment.LURE, 10 );                // Lure
            is.addUnsafeEnchantment( Enchantment.DURABILITY, 10 );          // Unbreaking
            is.addUnsafeEnchantment( Enchantment.ARROW_INFINITE, 10 );      // Infinity
            lores.add( "§7効率強化 Ⅹ" );
            lores.add( "§7耐久力 Ⅹ" );
        } else {
            is.addUnsafeEnchantment( Enchantment.DIG_SPEED, 6 );            // Efficiency
            is.addUnsafeEnchantment( Enchantment.LURE, 6 );                 // Lure
            is.addUnsafeEnchantment( Enchantment.DURABILITY, 0 );           // Unbreaking
            is.addUnsafeEnchantment( Enchantment.ARROW_INFINITE, 0 );       // Infinity
            lores.add( "§7効率強化 Ⅵ" );
        }

        is.addUnsafeEnchantment( Enchantment.SILK_TOUCH, 1);                // SILK_TOUCH
        lores.add( "§d整地イベント参加賞" );

        ItemMeta im = is.getItemMeta();             //  ItemStackから、ItemMetaを取得
        im.setDisplayName( ToolName );              //  Item名を設定
        im.setLore( lores );                        //  loreを設定します。
        im.addItemFlags( ItemFlag.HIDE_ENCHANTS );  //  本来のエンチャント情報を隠す
        is.setItemMeta( im );                       //  元のItemStackに、変更したItemMetaを設定

        return is;
    }
}
