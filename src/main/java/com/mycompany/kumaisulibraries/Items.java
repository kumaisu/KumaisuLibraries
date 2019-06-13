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
}
