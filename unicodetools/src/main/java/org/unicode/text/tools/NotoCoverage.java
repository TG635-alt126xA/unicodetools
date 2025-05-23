package org.unicode.text.tools;

import com.google.common.base.Splitter;
import com.ibm.icu.impl.UnicodeMap;
import com.ibm.icu.text.UnicodeSet;
import java.util.List;
import org.unicode.cldr.draft.FileUtilities;
import org.unicode.text.utility.Utility;
import org.unicode.tools.emoji.Emoji;

public class NotoCoverage {
    static final UnicodeMap<String> DATA = new UnicodeMap<>();

    static {
        DATA.putAll(
                new UnicodeSet(
                                "[\\x{20e3}\\x{2122}\\x{231a}\\x{231b}\\x{23e9}\\x{23ea}\\x{23eb}\\x{23ec}\\x{23f0}\\x{23f3}\\x{2601}\\x{2611}\\x{2614}\\x{2615}\\x{261d}\\x{263a}\\x{2648}\\x{2649}\\x{264a}\\x{264b}\\x{264c}\\x{264d}\\x{264e}\\x{264f}\\x{2650}\\x{2651}\\x{2652}\\x{2653}\\x{267b}\\x{267f}\\x{2693}\\x{26a0}\\x{26a1}\\x{26bd}\\x{26be}\\x{26c4}\\x{26c5}\\x{26ce}\\x{26d4}\\x{26ea}\\x{26f2}\\x{26f3}\\x{26f5}\\x{26fa}\\x{26fd}\\x{2705}\\x{270a}\\x{270b}\\x{270c}\\x{2728}\\x{274c}\\x{274e}\\x{2753}\\x{2754}\\x{2755}\\x{2795}\\x{2796}\\x{2797}\\x{27b0}\\x{27bf}\\x{3030}\\x{303d}\\x{1f004}\\x{1f0cf}\\x{1f170}\\x{1f171}\\x{1f17e}\\x{1f17f}\\x{1f18e}\\x{1f191}\\x{1f192}\\x{1f193}\\x{1f194}\\x{1f195}\\x{1f196}\\x{1f197}\\x{1f198}\\x{1f199}\\x{1f19a}\\x{1f1e6}\\x{1f1e7}\\x{1f1e8}\\x{1f1e9}\\x{1f1ea}\\x{1f1eb}\\x{1f1ec}\\x{1f1ed}\\x{1f1ee}\\x{1f1ef}\\x{1f1f0}\\x{1f1f1}\\x{1f1f2}\\x{1f1f3}\\x{1f1f4}\\x{1f1f5}\\x{1f1f6}\\x{1f1f7}\\x{1f1f8}\\x{1f1f9}\\x{1f1fa}\\x{1f1fb}\\x{1f1fc}\\x{1f1fd}\\x{1f1fe}\\x{1f1ff}\\x{1f201}\\x{1f202}\\x{1f21a}\\x{1f22f}\\x{1f232}\\x{1f233}\\x{1f234}\\x{1f235}\\x{1f236}\\x{1f237}\\x{1f238}\\x{1f239}\\x{1f23a}\\x{1f250}\\x{1f251}\\x{1f300}\\x{1f301}\\x{1f302}\\x{1f303}\\x{1f304}\\x{1f305}\\x{1f306}\\x{1f307}\\x{1f308}\\x{1f309}\\x{1f30a}\\x{1f30b}\\x{1f30c}\\x{1f30d}\\x{1f30e}\\x{1f30f}\\x{1f310}\\x{1f311}\\x{1f312}\\x{1f313}\\x{1f314}\\x{1f315}\\x{1f316}\\x{1f317}\\x{1f318}\\x{1f319}\\x{1f31a}\\x{1f31b}\\x{1f31c}\\x{1f31d}\\x{1f31e}\\x{1f31f}\\x{1f320}\\x{1f330}\\x{1f331}\\x{1f332}\\x{1f333}\\x{1f334}\\x{1f335}\\x{1f337}\\x{1f338}\\x{1f339}\\x{1f33a}\\x{1f33b}\\x{1f33c}\\x{1f33d}\\x{1f33e}\\x{1f33f}\\x{1f340}\\x{1f341}\\x{1f342}\\x{1f343}\\x{1f344}\\x{1f345}\\x{1f346}\\x{1f347}\\x{1f348}\\x{1f349}\\x{1f34a}\\x{1f34b}\\x{1f34c}\\x{1f34d}\\x{1f34e}\\x{1f34f}\\x{1f350}\\x{1f351}\\x{1f352}\\x{1f353}\\x{1f354}\\x{1f355}\\x{1f356}\\x{1f357}\\x{1f358}\\x{1f359}\\x{1f35a}\\x{1f35b}\\x{1f35c}\\x{1f35d}\\x{1f35e}\\x{1f35f}\\x{1f360}\\x{1f361}\\x{1f362}\\x{1f363}\\x{1f364}\\x{1f365}\\x{1f366}\\x{1f367}\\x{1f368}\\x{1f369}\\x{1f36a}\\x{1f36b}\\x{1f36c}\\x{1f36d}\\x{1f36e}\\x{1f36f}\\x{1f370}\\x{1f371}\\x{1f372}\\x{1f373}\\x{1f374}\\x{1f375}\\x{1f376}\\x{1f377}\\x{1f378}\\x{1f379}\\x{1f37a}\\x{1f37b}\\x{1f37c}\\x{1f380}\\x{1f381}\\x{1f382}\\x{1f383}\\x{1f384}\\x{1f385}\\x{1f386}\\x{1f387}\\x{1f388}\\x{1f389}\\x{1f38a}\\x{1f38b}\\x{1f38c}\\x{1f38d}\\x{1f38e}\\x{1f38f}\\x{1f390}\\x{1f391}\\x{1f392}\\x{1f393}\\x{1f3a0}\\x{1f3a1}\\x{1f3a2}\\x{1f3a3}\\x{1f3a4}\\x{1f3a5}\\x{1f3a6}\\x{1f3a7}\\x{1f3a8}\\x{1f3a9}\\x{1f3aa}\\x{1f3ab}\\x{1f3ac}\\x{1f3ad}\\x{1f3ae}\\x{1f3af}\\x{1f3b0}\\x{1f3b1}\\x{1f3b2}\\x{1f3b3}\\x{1f3b4}\\x{1f3b5}\\x{1f3b6}\\x{1f3b7}\\x{1f3b8}\\x{1f3b9}\\x{1f3ba}\\x{1f3bb}\\x{1f3bc}\\x{1f3bd}\\x{1f3be}\\x{1f3bf}\\x{1f3c0}\\x{1f3c1}\\x{1f3c2}\\x{1f3c3}\\x{1f3c4}\\x{1f3c6}\\x{1f3c7}\\x{1f3c8}\\x{1f3c9}\\x{1f3ca}\\x{1f3e0}\\x{1f3e1}\\x{1f3e2}\\x{1f3e3}\\x{1f3e4}\\x{1f3e5}\\x{1f3e6}\\x{1f3e7}\\x{1f3e8}\\x{1f3e9}\\x{1f3ea}\\x{1f3eb}\\x{1f3ec}\\x{1f3ed}\\x{1f3ee}\\x{1f3ef}\\x{1f3f0}\\x{1f400}\\x{1f401}\\x{1f402}\\x{1f403}\\x{1f404}\\x{1f405}\\x{1f406}\\x{1f407}\\x{1f408}\\x{1f409}\\x{1f40a}\\x{1f40b}\\x{1f40c}\\x{1f40d}\\x{1f40e}\\x{1f40f}\\x{1f410}\\x{1f411}\\x{1f412}\\x{1f413}\\x{1f414}\\x{1f415}\\x{1f416}\\x{1f417}\\x{1f418}\\x{1f419}\\x{1f41a}\\x{1f41b}\\x{1f41c}\\x{1f41d}\\x{1f41e}\\x{1f41f}\\x{1f420}\\x{1f421}\\x{1f422}\\x{1f423}\\x{1f424}\\x{1f425}\\x{1f426}\\x{1f427}\\x{1f428}\\x{1f429}\\x{1f42a}\\x{1f42b}\\x{1f42c}\\x{1f42d}\\x{1f42e}\\x{1f42f}\\x{1f430}\\x{1f431}\\x{1f432}\\x{1f433}\\x{1f434}\\x{1f435}\\x{1f436}\\x{1f437}\\x{1f438}\\x{1f439}\\x{1f43a}\\x{1f43b}\\x{1f43c}\\x{1f43d}\\x{1f43e}\\x{1f440}\\x{1f442}\\x{1f443}\\x{1f444}\\x{1f445}\\x{1f446}\\x{1f447}\\x{1f448}\\x{1f449}\\x{1f44a}\\x{1f44b}\\x{1f44c}\\x{1f44d}\\x{1f44e}\\x{1f44f}\\x{1f450}\\x{1f451}\\x{1f452}\\x{1f453}\\x{1f454}\\x{1f455}\\x{1f456}\\x{1f457}\\x{1f458}\\x{1f459}\\x{1f45a}\\x{1f45b}\\x{1f45c}\\x{1f45d}\\x{1f45e}\\x{1f45f}\\x{1f460}\\x{1f461}\\x{1f462}\\x{1f463}\\x{1f464}\\x{1f465}\\x{1f466}\\x{1f467}\\x{1f468}\\x{1f469}\\x{1f46a}\\x{1f46b}\\x{1f46c}\\x{1f46d}\\x{1f46e}\\x{1f46f}\\x{1f470}\\x{1f471}\\x{1f472}\\x{1f473}\\x{1f474}\\x{1f475}\\x{1f476}\\x{1f477}\\x{1f478}\\x{1f479}\\x{1f47a}\\x{1f47b}\\x{1f47c}\\x{1f47d}\\x{1f47e}\\x{1f47f}\\x{1f480}\\x{1f481}\\x{1f482}\\x{1f483}\\x{1f484}\\x{1f485}\\x{1f486}\\x{1f487}\\x{1f488}\\x{1f489}\\x{1f48a}\\x{1f48b}\\x{1f48c}\\x{1f48d}\\x{1f48e}\\x{1f48f}\\x{1f490}\\x{1f491}\\x{1f492}\\x{1f493}\\x{1f494}\\x{1f495}\\x{1f496}\\x{1f497}\\x{1f498}\\x{1f499}\\x{1f49a}\\x{1f49b}\\x{1f49c}\\x{1f49d}\\x{1f49e}\\x{1f49f}\\x{1f4a0}\\x{1f4a1}\\x{1f4a2}\\x{1f4a3}\\x{1f4a4}\\x{1f4a5}\\x{1f4a6}\\x{1f4a7}\\x{1f4a8}\\x{1f4a9}\\x{1f4aa}\\x{1f4ab}\\x{1f4ac}\\x{1f4ad}\\x{1f4ae}\\x{1f4af}\\x{1f4b0}\\x{1f4b1}\\x{1f4b2}\\x{1f4b3}\\x{1f4b4}\\x{1f4b5}\\x{1f4b6}\\x{1f4b7}\\x{1f4b8}\\x{1f4b9}\\x{1f4ba}\\x{1f4bb}\\x{1f4bc}\\x{1f4bd}\\x{1f4be}\\x{1f4bf}\\x{1f4c0}\\x{1f4c1}\\x{1f4c2}\\x{1f4c3}\\x{1f4c4}\\x{1f4c5}\\x{1f4c6}\\x{1f4c7}\\x{1f4c8}\\x{1f4c9}\\x{1f4ca}\\x{1f4cb}\\x{1f4cc}\\x{1f4cd}\\x{1f4ce}\\x{1f4cf}\\x{1f4d0}\\x{1f4d1}\\x{1f4d2}\\x{1f4d3}\\x{1f4d4}\\x{1f4d5}\\x{1f4d6}\\x{1f4d7}\\x{1f4d8}\\x{1f4d9}\\x{1f4da}\\x{1f4db}\\x{1f4dc}\\x{1f4dd}\\x{1f4de}\\x{1f4df}\\x{1f4e0}\\x{1f4e1}\\x{1f4e2}\\x{1f4e3}\\x{1f4e4}\\x{1f4e5}\\x{1f4e6}\\x{1f4e7}\\x{1f4e8}\\x{1f4e9}\\x{1f4ea}\\x{1f4eb}\\x{1f4ec}\\x{1f4ed}\\x{1f4ee}\\x{1f4ef}\\x{1f4f0}\\x{1f4f1}\\x{1f4f2}\\x{1f4f3}\\x{1f4f4}\\x{1f4f5}\\x{1f4f6}\\x{1f4f7}\\x{1f4f9}\\x{1f4fa}\\x{1f4fb}\\x{1f4fc}\\x{1f500}\\x{1f501}\\x{1f502}\\x{1f503}\\x{1f504}\\x{1f505}\\x{1f506}\\x{1f507}\\x{1f508}\\x{1f509}\\x{1f50a}\\x{1f50b}\\x{1f50c}\\x{1f50d}\\x{1f50e}\\x{1f50f}\\x{1f510}\\x{1f511}\\x{1f512}\\x{1f513}\\x{1f514}\\x{1f515}\\x{1f516}\\x{1f517}\\x{1f518}\\x{1f519}\\x{1f51a}\\x{1f51b}\\x{1f51c}\\x{1f51d}\\x{1f51e}\\x{1f51f}\\x{1f520}\\x{1f521}\\x{1f522}\\x{1f523}\\x{1f524}\\x{1f525}\\x{1f526}\\x{1f527}\\x{1f528}\\x{1f529}\\x{1f52a}\\x{1f52b}\\x{1f52c}\\x{1f52d}\\x{1f52e}\\x{1f52f}\\x{1f530}\\x{1f531}\\x{1f532}\\x{1f533}\\x{1f534}\\x{1f535}\\x{1f536}\\x{1f537}\\x{1f538}\\x{1f539}\\x{1f53a}\\x{1f53b}\\x{1f53c}\\x{1f53d}\\x{1f550}\\x{1f551}\\x{1f552}\\x{1f553}\\x{1f554}\\x{1f555}\\x{1f556}\\x{1f557}\\x{1f558}\\x{1f559}\\x{1f55a}\\x{1f55b}\\x{1f55c}\\x{1f55d}\\x{1f55e}\\x{1f55f}\\x{1f560}\\x{1f561}\\x{1f562}\\x{1f563}\\x{1f564}\\x{1f565}\\x{1f566}\\x{1f567}\\x{1f5fb}\\x{1f5fc}\\x{1f5fd}\\x{1f5fe}\\x{1f5ff}\\x{1f600}\\x{1f601}\\x{1f602}\\x{1f603}\\x{1f604}\\x{1f605}\\x{1f606}\\x{1f607}\\x{1f608}\\x{1f609}\\x{1f60a}\\x{1f60b}\\x{1f60c}\\x{1f60d}\\x{1f60e}\\x{1f60f}\\x{1f610}\\x{1f611}\\x{1f612}\\x{1f613}\\x{1f614}\\x{1f615}\\x{1f616}\\x{1f617}\\x{1f618}\\x{1f619}\\x{1f61a}\\x{1f61b}\\x{1f61c}\\x{1f61d}\\x{1f61e}\\x{1f61f}\\x{1f620}\\x{1f621}\\x{1f622}\\x{1f623}\\x{1f624}\\x{1f625}\\x{1f626}\\x{1f627}\\x{1f628}\\x{1f629}\\x{1f62a}\\x{1f62b}\\x{1f62c}\\x{1f62d}\\x{1f62e}\\x{1f62f}\\x{1f630}\\x{1f631}\\x{1f632}\\x{1f633}\\x{1f634}\\x{1f635}\\x{1f636}\\x{1f637}\\x{1f638}\\x{1f639}\\x{1f63a}\\x{1f63b}\\x{1f63c}\\x{1f63d}\\x{1f63e}\\x{1f63f}\\x{1f640}\\x{1f645}\\x{1f646}\\x{1f647}\\x{1f648}\\x{1f649}\\x{1f64a}\\x{1f64b}\\x{1f64c}\\x{1f64d}\\x{1f64e}\\x{1f64f}\\x{1f680}\\x{1f681}\\x{1f682}\\x{1f683}\\x{1f684}\\x{1f685}\\x{1f686}\\x{1f687}\\x{1f688}\\x{1f689}\\x{1f68a}\\x{1f68b}\\x{1f68c}\\x{1f68d}\\x{1f68e}\\x{1f68f}\\x{1f690}\\x{1f691}\\x{1f692}\\x{1f693}\\x{1f694}\\x{1f695}\\x{1f696}\\x{1f697}\\x{1f698}\\x{1f699}\\x{1f69a}\\x{1f69b}\\x{1f69c}\\x{1f69d}\\x{1f69e}\\x{1f69f}\\x{1f6a0}\\x{1f6a1}\\x{1f6a2}\\x{1f6a3}\\x{1f6a4}\\x{1f6a5}\\x{1f6a6}\\x{1f6a7}\\x{1f6a8}\\x{1f6a9}\\x{1f6aa}\\x{1f6ab}\\x{1f6ac}\\x{1f6ad}\\x{1f6ae}\\x{1f6af}\\x{1f6b0}\\x{1f6b1}\\x{1f6b2}\\x{1f6b3}\\x{1f6b4}\\x{1f6b5}\\x{1f6b6}\\x{1f6b7}\\x{1f6b8}\\x{1f6b9}\\x{1f6ba}\\x{1f6bb}\\x{1f6bc}\\x{1f6bd}\\x{1f6be}\\x{1f6bf}\\x{1f6c0}\\x{1f6c1}\\x{1f6c2}\\x{1f6c3}\\x{1f6c4}\\x{1f6c5}\\x{fe4e5}\\x{fe4e6}\\x{fe4e7}\\x{fe4e8}\\x{fe4e9}\\x{fe4ea}\\x{fe4eb}\\x{fe4ec}\\x{fe4ed}\\x{fe4ee}\\x{fe82c}\\x{fe82e}\\x{fe82f}\\x{fe830}\\x{fe831}\\x{fe832}\\x{fe833}\\x{fe834}\\x{fe835}\\x{fe836}\\x{fe837}]")
                        .removeAll(new UnicodeSet("[:M:]")),
                "Emoji-Color");
        Splitter lineSplitter = Splitter.onPattern("\\.\\.|;").trimResults();
        for (String line : FileUtilities.in(Emoji.class, "notoCoverage.txt")) {
            // 2F83B ;  NotoSansCJKjp-Black
            // 2F83F..2F840 ;  NotoSansCJKjp-Black
            List<String> items = lineSplitter.splitToList(line);
            String codePoint = Utility.fromHex(items.get(0));
            switch (items.size()) {
                case 3:
                    String codePointEnd = Utility.fromHex(items.get(1));
                    DATA.putAll(
                            codePoint.codePointAt(0), codePointEnd.codePointAt(0), items.get(1));
                    break;
                case 2:
                    DATA.put(codePoint, items.get(1));
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        }
        DATA.freeze();
    }

    public static UnicodeMap<String> getData() {
        return DATA;
    }

    public static boolean isCovered(int cp) {
        return DATA.containsKey(cp);
    }
}
