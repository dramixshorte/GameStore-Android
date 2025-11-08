/*
 *
 * Project Name : Game Store
 * Copyright (c) 2023."All rights reserved"
 * @author : PrettySoftware
 * @created : 26/05/2023, Friday
 *
 */
package com.GamesComplex.games

object GameHomeList {
    var MainArrayList: ArrayList<ArrayList<HashMap<String, String>>?>? = null
    @JvmField
    var GameArrayList: ArrayList<HashMap<String, String>?>? = null
    var ViewList: ArrayList<HashMap<String, String>>? = null
    var GameHashMap: HashMap<String, String>? = null



    //Start Category Home Game All List
    //===============================Some automation
    private fun MakeGameList(GameName: String, drawable: Int, GameUrl: String) {
        MainArrayList!!.add(ViewList)
        GameHashMap = HashMap()
        GameHashMap!!["GameName"] = GameName
        GameHashMap!!["GameLogo"] = drawable.toString()
        GameHashMap!!["GameUrl"] = GameUrl
        GameArrayList!!.add(GameHashMap)
        ViewList = ArrayList()
    }

    @JvmStatic
    fun GameTableList() {
        MainArrayList = ArrayList()
        GameArrayList = ArrayList()
        ViewList = ArrayList()
        MakeGameList("Stack Smash", R.drawable.stack_smash_6, "https://play.famobi.com/stack-smash")
        MakeGameList("Bubble Tower", R.drawable.bubbletower_1, "https://play.famobi.com/bubble-tower-3d")
        MakeGameList("Knife Rain", R.drawable.knife_rain_4, "https://play.famobi.com/knife-rain")
        MakeGameList("Jewel Jungle", R.drawable.jewel_jungle, "https://play.famobi.com/jewel-jungle")
        MakeGameList("Tower Crash", R.drawable.tower_crash3d_12, "https://play.famobi.com/tower-crash-3d")
        MakeGameList("Om Nom bubble", R.drawable.omnom_bubbles_5, "https://play.famobi.com/om-nom-bubbles")
        MakeGameList("Totemia Cursed", R.drawable.totemia_cursed, "https://games.cdn.famobi.com/html5games/t/totemia-cursed-marbles/v230/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=ca588700-4790-46f1-82a2-cef934fd368a&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=173&original_ref=")
        MakeGameList("Fruit Ninja", R.drawable.fruit_ninja_2, "https://play.famobi.com/fruit-ninja")
        MakeGameList("Monkey Bounce", R.drawable.monkey_bounce, "https://games.cdn.famobi.com/html5games/m/monkey-bounce/v040/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=cf951a62-6031-4b49-8870-60cfe8569a9f&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=741&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Neon Swing", R.drawable.neon_swing_16, "https://play.famobi.com/neon-swing")
        MakeGameList("Bubble woods", R.drawable.bubble_woods, "https://play.famobi.com/bubble-woods")
        MakeGameList("Happy Panda", R.drawable.happy_panda_3, "https://play.famobi.com/happy-panda")
        MakeGameList("Neon Tower", R.drawable.neon_tower_9, "https://play.famobi.com/neon-tower")
        MakeGameList("Zoo Boom", R.drawable.zoo_boom_7, "https://play.famobi.com/zoo-boom")
        MakeGameList("Hop Don't Stop", R.drawable.hop_dont, "https://games.cdn.famobi.com/html5games/h/hop-dont-stop/v050/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=93136c60-f037-4952-9679-92b1e075db5a&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=727&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Candy Bubble", R.drawable.candy_bubble, "https://play.famobi.com/candy-bubble")
        MakeGameList("Smarty Bubble", R.drawable.smarty_bubble, "https://play.famobi.com/smarty-bubbles")
        MakeGameList("Thug Racer", R.drawable.thug_racer, "https://play.famobi.com/thug-racer")
        MakeGameList("Traffic Tom", R.drawable.traffic_tom_8, "https://play.famobi.com/traffic-tom")
        MakeGameList("Emoji Flow", R.drawable.emoji_flow_10, "https://games.cdn.famobi.com/html5games/e/emoji-flow/v020/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=e2a1b037-34c7-48c5-95c6-bcafe4a46e93&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=176&original_ref=")
        MakeGameList("Crowd Run 3d", R.drawable.crowdrun3d_11, "https://games.cdn.famobi.com/html5games/c/crowd-run-3d/v040/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=28ab613b-9f40-4ab7-8f09-aa19f32e3660&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=160&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Stair Race", R.drawable.stair_race3d_13, "https://play.famobi.com/stair-race-3d")
        MakeGameList("TapTap Dunk", R.drawable.taptap_dunk_14, "https://play.famobi.com/tap-tap-dunk")
        MakeGameList("Katana Fruits", R.drawable.katana_fruits, "https://play.famobi.com/katana-fruits")
        MakeGameList("Drift Dudes", R.drawable.driftdudes_15, "https://play.famobi.com/drift-dudes")
        MakeGameList("Soccer Bubble", R.drawable.soccer_bubbles, "https://play.famobi.com/soccer-bubbles")
        MakeGameList("Pirates Match3", R.drawable.pirates_match3, "https://play.famobi.com/pirates-the-match-3")
        MakeGameList("Basket Monsterz", R.drawable.basket_monsterz, "https://games.cdn.famobi.com/html5games/b/basket-monsterz/v140/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=57c29be2-5bb3-47ba-90a5-04b9089b76b4&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=716&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Monster Pet", R.drawable.monster_pet, "https://games.cdn.famobi.com/html5games/m/monster-pet/v4/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=fed4c4a8-dea4-4261-8a7d-4d649217dd05&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=720&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Sprint Club", R.drawable.sprint_club, "https://games.cdn.famobi.com/html5games/s/sprint-club-nitro/v080/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=22d54936-998a-4d6d-82c1-895792f1c573&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=721&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Burnin Rubber", R.drawable.burnin_rubber, "https://games.cdn.famobi.com/html5games/b/burnin-rubber/v140/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=d55c9a5f-59ef-44c9-9fd9-b8b60cdb6b92&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=733&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Fruita Crush", R.drawable.fruita_crush, "https://games.cdn.famobi.com/html5games/f/fruita-crush/v060/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=b97fe0cb-66f4-4005-b37a-eb245b648053&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=736&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Color Shape", R.drawable.color_shape, "https://games.cdn.famobi.com/html5games/c/color-shape/v080/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=f7ee9f85-5427-408c-9c29-1f997f129b81&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=739&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Football Tricks", R.drawable.football_tricks, "https://games.cdn.famobi.com/html5games/f/football-tricks/v2/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=76396b8a-7e5c-49c3-9f44-59d90f8d731b&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=732&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        MakeGameList("Merge Jewels", R.drawable.merge_jewels, "https://games.cdn.famobi.com/html5games/m/merge-jewels/v160/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=3f1d74b9-66ea-44b9-991f-7908c2fee68d&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=749&original_ref=https%3A%2F%2Fgames.famobi.com%2F")

    }//End Category Home Game All List



    //Start Category Action Game All List
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private fun ActionGameList(ActionName: String, drawable: Int, ActionUrl: String) {
        MainArrayList!!.add(ViewList)
        GameHashMap = HashMap()
        GameHashMap!!["ActionName"] = ActionName
        GameHashMap!!["ActionImg"] = drawable.toString()
        GameHashMap!!["ActionUrl"] = ActionUrl
        GameArrayList!!.add(GameHashMap)
        ViewList = ArrayList()
    }

    @JvmStatic
    fun ActionList() {
        MainArrayList = ArrayList()
        GameArrayList = ArrayList()
        ViewList = ArrayList()
        ActionGameList("Jetpack Joyride", R.drawable.jetpackjoyride, "https://games.cdn.famobi.com/html5games/j/jetpack-joyride/v030/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=6136c21a-b83b-48de-9f8f-0974444ee1d1&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=158&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Crowd Run", R.drawable.crowdrun3d_11, "https://games.cdn.famobi.com/html5games/c/crowd-run-3d/v040/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=28ab613b-9f40-4ab7-8f09-aa19f32e3660&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=160&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Running Jack", R.drawable.rj, "https://games.cdn.famobi.com/html5games/k/kumba-kool/v120/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=16afbe05-a248-4978-b982-57cd59f5d615&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=162&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("K.U.L.I.", R.drawable.kl, "https://games.cdn.famobi.com/html5games/z/zombies-eat-my-stocking/v5/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=10158f0e-0fd1-4f73-b38c-108a3f684146&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=163&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Cannons", R.drawable.cs, "https://games.cdn.famobi.com/html5games/c/cannons-and-soldiers/v6/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=f1baf796-217a-4d1b-bb6e-77924caf7db5&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=163&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Tiny Rifles", R.drawable.tr, "https://games.cdn.famobi.com/html5games/t/tiny-rifles/v040/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=738c6e89-7249-4e5a-8b6c-36899b1683c1&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=165&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("High Hills", R.drawable.hh, "https://games.cdn.famobi.com/html5games/h/high-hills/v130/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=2a35d037-696c-4351-9e34-7260392f9404&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=172&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Rain Forest", R.drawable.rf, "https://games.cdn.famobi.com/html5games/r/rain-forest-hunter/v1/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=5f0ecf67-3134-4f14-bbf9-c6bb2465c6bb&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=185&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Drivers", R.drawable.ad, "https://games.cdn.famobi.com/html5games/a/adventure-drivers/v060/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=7adef9f1-9ddd-437a-b5ee-196da61ba5c7&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=186&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Pilot Heroes", R.drawable.ph, "https://games.cdn.famobi.com/html5games/p/pilot-heroes/v130/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=1c400eea-0f01-490b-b64e-7a9966ffb6a8&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=188&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Archery Tour", R.drawable.at, "https://games.cdn.famobi.com/html5games/a/archery-world-tour/v460/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=ebcb987a-3fd0-4b4a-bae6-f456fff9cac3&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=197&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Kumba Kool", R.drawable.kk, "https://games.cdn.famobi.com/html5games/k/kumba-kool/v120/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=16afbe05-a248-4978-b982-57cd59f5d615&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=202&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Burnin Rubber", R.drawable.br, "https://games.cdn.famobi.com/html5games/b/burnin-rubber/v140/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=d55c9a5f-59ef-44c9-9fd9-b8b60cdb6b92&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=206&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        ActionGameList("Fishy Rush", R.drawable.fr, "https://games.cdn.famobi.com/html5games/z/zoo-boom/v2890/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=5e772ebe-9e0a-4cd3-adcf-bba662f35535&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=207&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
    }//End Category Action Game All List



    //Start Category Sports Game All List
    fun SportsGameList(SportsName: String, drawable: Int, SportsUrl: String) {
        MainArrayList!!.add(ViewList)
        GameHashMap = HashMap()
        GameHashMap!!["SportsName"] = SportsName
        GameHashMap!!["SportsImg"] = drawable.toString()
        GameHashMap!!["SportsUrl"] = SportsUrl
        GameArrayList!!.add(GameHashMap)
        ViewList = ArrayList()
    }

    @JvmStatic
    fun SportsList() {
        MainArrayList = ArrayList()
        GameArrayList = ArrayList()
        ViewList = ArrayList()
        SportsGameList("Billiard Blitz", R.drawable.bb, "https://games.cdn.famobi.com/html5games/b/billiard-blitz-challenge/v390/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=e72de216-92b4-4efc-a2b9-8318e819139b&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=408&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("World Cup", R.drawable.wc, "https://games.cdn.famobi.com/html5games/w/world-cup-penalty/v110/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=9267ab1a-835f-4a09-be73-1f8f8e4cd414&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=410&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Archery Tour", R.drawable.awt, "https://games.cdn.famobi.com/html5games/a/archery-world-tour/v460/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=ebcb987a-3fd0-4b4a-bae6-f456fff9cac3&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=409&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Ball Billiards", R.drawable.bbc, "https://games.cdn.famobi.com/html5games/0/8-ball-billiards-classic/v250/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=82038e98-d4e1-46dd-8de9-1460d1395eab&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=411&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Arcade Golf", R.drawable.ag, "https://games.cdn.famobi.com/html5games/a/arcade-golf-neon/v330/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=ef5f6169-6928-48e0-944d-e119ad0413cb&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=414&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Drag Racing", R.drawable.drc, "https://games.cdn.famobi.com/html5games/d/drag-racing-club/v060/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=7903c763-4f6b-48fb-8396-3a18daae70c7&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=416&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Blaze Kick", R.drawable.bk, "https://games.cdn.famobi.com/html5games/b/blaze-kick/v230/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=7c3d6873-9470-466b-8e8c-d68aa8c6d699&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=417&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Highway Rider", R.drawable.hre, "https://games.cdn.famobi.com/html5games/h/highway-rider-extreme/v060/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=83175bfa-1c89-46d9-91da-7ea5fc7a642f&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=417&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("3D Penalty", R.drawable.pt, "https://games.cdn.famobi.com/html5games/0/3d-penalty/v040/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=f6e2ba91-50ba-4bae-88a8-5f1434e6fa04&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=421&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Racing Cars", R.drawable.rct, "https://games.cdn.famobi.com/html5games/r/racing-cars/v670/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=ba418425-068d-4b12-9a35-21d9db2572f4&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=424&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Basketball", R.drawable.bbt, "https://games.cdn.famobi.com/html5games/b/basketball/v070/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=42fdec95-13a2-4af7-b0f1-776a7861f0bd&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=425&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Ultimate Boxing", R.drawable.ub, "https://games.cdn.famobi.com/html5games/u/ultimate-boxing/v020/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=734d35f4-9606-4a19-9016-acc6081879a2&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=427&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("Skeet Challenge", R.drawable.sc, "https://games.cdn.famobi.com/html5games/a/archery-world-tour/v460/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=ebcb987a-3fd0-4b4a-bae6-f456fff9cac3&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=428&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
        SportsGameList("City Dunk", R.drawable.cdt, "https://games.cdn.famobi.com/html5games/c/city-dunk/v280/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=30f1d7c4-2724-4cd3-b4d0-f67a2efa8e61&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=429&original_ref=https%3A%2F%2Fgames.famobi.com%2F")
    }//End Category Sports Game All List




    //Start Category Puzzle Game All List
    fun PuzzleGameList(PuzzleName: String, drawable: Int, PuzzleUrl: String) {
        MainArrayList!!.add(ViewList)
        GameHashMap = HashMap()
        GameHashMap!!["PuzzleName"] = PuzzleName
        GameHashMap!!["PuzzleImg"] = drawable.toString()
        GameHashMap!!["PuzzleUrl"] = PuzzleUrl
        GameArrayList!!.add(GameHashMap)
        ViewList = ArrayList()
    }

    @JvmStatic
    fun PuzzleList() {
        MainArrayList = ArrayList()
        GameArrayList = ArrayList()
        ViewList = ArrayList()
        PuzzleGameList("Emoji Flow", R.drawable.emoji_flow_10, "https://play.famobi.com/emoji-flow")
        PuzzleGameList("Butterfly", R.drawable.bs, "https://play.famobi.com/butterfly-shimai")
        PuzzleGameList("Dices 2048", R.drawable.di, "https://play.famobi.com/dices-2048-3d")
        PuzzleGameList("Om Nom", R.drawable.onc, "https://play.famobi.com/om-nom-connect-classic")
        PuzzleGameList("Zoo Boom", R.drawable.zb, "https://play.famobi.com/zoo-boom")
        PuzzleGameList("Hex Zen", R.drawable.hz, "https://play.famobi.com/hex-zen")
        PuzzleGameList("Kitten Match", R.drawable.km, "https://play.famobi.com/kitten-match")
        PuzzleGameList("Hex Puzzle", R.drawable.hpx, "https://play.famobi.com/hex-puzzle")
        PuzzleGameList("Pipe Mania", R.drawable.ppm, "https://play.famobi.com/pipe-mania")
        PuzzleGameList("Jewels Mania", R.drawable.jmt, "https://play.famobi.com/jewels-mania")
        PuzzleGameList("Onet World", R.drawable.owt, "https://play.famobi.com/onet-world")
        PuzzleGameList("Sailor Pop", R.drawable.spt, "https://play.famobi.com/sailor-pop")
    }//End Category Puzzle Game All List



    //Start Category Racing Game All List
    fun RacingGameList(RacingName: String, drawable: Int, RacingUrl: String) {
        MainArrayList!!.add(ViewList)
        GameHashMap = HashMap()
        GameHashMap!!["RacingName"] = RacingName
        GameHashMap!!["RacingImg"] = drawable.toString()
        GameHashMap!!["RacingUrl"] = RacingUrl
        GameArrayList!!.add(GameHashMap)
        ViewList = ArrayList()
    }

    @JvmStatic
    fun RacingList() {
        MainArrayList = ArrayList()
        GameArrayList = ArrayList()
        ViewList = ArrayList()
        RacingGameList("Drift Dudes", R.drawable.ddt, "https://play.famobi.com/drift-dudes")
        RacingGameList("E-Scooter", R.drawable.est, "https://play.famobi.com/e-scooter")
        RacingGameList("Traffic Tom", R.drawable.ttt, "https://play.famobi.com/traffic-tom")
        RacingGameList("High Hills", R.drawable.hht, "https://play.famobi.com/high-hills")
        RacingGameList("Highway", R.drawable.hte, "https://play.famobi.com/highway-rider-extreme")
        RacingGameList("Truck Trials", R.drawable.tts, "https://play.famobi.com/truck-trials")
        RacingGameList("Biker Street", R.drawable.bst, "https://play.famobi.com/biker-street")
        RacingGameList("Moto Fury", R.drawable.mft, "https://play.famobi.com/moto-fury")
        RacingGameList("Turbotastic", R.drawable.ttf, "https://play.famobi.com/turbotastic")
        RacingGameList("Race Right", R.drawable.rrts, "https://play.famobi.com/race-right")
        RacingGameList("Speed Maniac", R.drawable.smt, "https://play.famobi.com/speed-maniac")
        RacingGameList("Endless Truck", R.drawable.ett, "https://play.famobi.com/endless-truck")
    }//End Category Racing Game All List



    //Start Category Education Game All List
    fun EducationGameList(EducationName: String, drawable: Int, EducationUrl: String) {
        MainArrayList!!.add(ViewList)
        GameHashMap = HashMap()
        GameHashMap!!["EducationName"] = EducationName
        GameHashMap!!["EducationImg"] = drawable.toString()
        GameHashMap!!["EducationUrl"] = EducationUrl
        GameArrayList!!.add(GameHashMap)
        ViewList = ArrayList()
    }

    @JvmStatic
    fun EducationList() {
        MainArrayList = ArrayList()
        GameArrayList = ArrayList()
        ViewList = ArrayList()
        EducationGameList("Brain Trainer", R.drawable.bttn, "https://play.famobi.com/brain-trainer")
        EducationGameList("Find In Mind", R.drawable.fmt, "https://play.famobi.com/find-in-mind")
        EducationGameList("Kids Color", R.drawable.kcfr, "https://play.famobi.com/kids-color-book-2")
        EducationGameList("Kids Puzzle", R.drawable.kbf, "https://play.famobi.com/kids-block-puzzle")
        EducationGameList("Kitten Match", R.drawable.kmtt, "https://play.famobi.com/kitten-match")
        EducationGameList("Match The Animal", R.drawable.mhtg, "https://play.famobi.com/match-the-animal")
        EducationGameList("Color Pixel", R.drawable.cpat, "https://play.famobi.com/color-pixel-art-classic")
        EducationGameList("Word Search", R.drawable.wsct, "https://play.famobi.com/word-search-classic")
        EducationGameList("4x Puzzle", R.drawable.psts, "https://play.famobi.com/4x-puzzle")
        EducationGameList("Kids Puzzle", R.drawable.kpst, "https://play.famobi.com/4x-puzzle")
        EducationGameList("Doctor Teeth", R.drawable.dttc, "https://play.famobi.com/doctor-teeth")
        EducationGameList("Grim Symbols", R.drawable.gst, "https://play.famobi.com/grim-symbols")
    }//End Category Education Game All List



    //Start Category Arcade Game All List
    fun ArcadeGameList(ArcadeName: String, drawable: Int, ArcadeUrl: String) {
        MainArrayList!!.add(ViewList)
        GameHashMap = HashMap()
        GameHashMap!!["ArcadeName"] = ArcadeName
        GameHashMap!!["ArcadeImg"] = drawable.toString()
        GameHashMap!!["ArcadeUrl"] = ArcadeUrl
        GameArrayList!!.add(GameHashMap)
        ViewList = ArrayList()
    }

    @JvmStatic
    fun ArcadeList() {
        MainArrayList = ArrayList()
        GameArrayList = ArrayList()
        ViewList = ArrayList()
        ArcadeGameList("Peet A Lock", R.drawable.pats, "https://play.famobi.com/peet-a-lock")
        ArcadeGameList("Peet Around", R.drawable.pate, "https://play.famobi.com/peet-around")
        ArcadeGameList("Pengu Slide", R.drawable.jjhs, "https://play.famobi.com/pengu-slide")
        ArcadeGameList("Slope", R.drawable.stst, "https://play.famobi.com/slope")
        ArcadeGameList("Cubito", R.drawable.ctcs, "https://play.famobi.com/cubito")
        ArcadeGameList("Ramp", R.drawable.rts, "https://play.famobi.com/ramp")
        ArcadeGameList("Hoop Royale", R.drawable.hrt, "https://play.famobi.com/hoop-royale")
        ArcadeGameList("Crazy Caves", R.drawable.cct, "https://play.famobi.com/crazy-caves")
        ArcadeGameList("City Dunk", R.drawable.ccdt, "https://play.famobi.com/city-dunk")
        ArcadeGameList("99 Balls", R.drawable.bbls, "https://play.famobi.com/99-balls")
        ArcadeGameList("Playful Kitty", R.drawable.pfkt, "https://play.famobi.com/playful-kitty")
        ArcadeGameList("Burger Maker", R.drawable.bkts, "https://play.famobi.com/burger-maker")
    }//End Category Arcade Game All List


}