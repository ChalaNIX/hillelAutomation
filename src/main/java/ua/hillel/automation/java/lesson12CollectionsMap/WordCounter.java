package ua.hillel.automation.java.lesson12CollectionsMap;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse vitae magna viverra, cursus lorem in, molestie risus. Mauris rhoncus placerat lorem. Pellentesque egestas semper metus, et egestas velit vulputate sed. Donec vitae turpis hendrerit, porta diam in, accumsan urna. Nulla nisl turpis, elementum id imperdiet non, ullamcorper a erat. Nullam eget sem nec odio vehicula vehicula a vel neque. Quisque ac aliquet sem, non dictum velit. Aliquam vehicula lectus tortor, quis pharetra urna finibus eget. Donec dictum, sem a vestibulum consequat, massa eros maximus enim, a aliquet ipsum nunc quis ipsum. Morbi aliquam ipsum at est interdum lacinia. Maecenas erat urna, dignissim vel libero id, efficitur aliquet turpis.Morbi gravida nunc enim, non ullamcorper massa semper vel. Vestibulum maximus dui sit amet rutrum volutpat. Nullam euismod tempus iaculis. Ut porta mauris in volutpat iaculis. Proin cursus dictum dapibus. Aenean eget porttitor arcu. Proin orci sapien, pulvinar et nisi gravida, porttitor interdum nibh. Integer vulputate nibh ac sapien maximus, ac rutrum erat auctor. Sed vulputate nec ex et laoreet. In ornare ante sit amet libero lobortis, non eleifend metus rhoncus. Phasellus convallis orci at sem convallis, et semper purus tempor. Vestibulum ut elit sit amet nisl venenatis aliquet vitae sit amet mauris. Cras consequat odio nec nisl lacinia lacinia. Sed at sodales turpis.Integer dui urna, bibendum at eros condimentum, pellentesque euismod metus. Mauris sed orci diam. Pellentesque felis purus, cursus sit amet odio ac, auctor congue lectus. Quisque ut nunc tellus. Donec at lectus vestibulum, commodo massa id, venenatis leo. Nulla facilisi. Nunc vestibulum mollis sapien.Aliquam euismod viverra hendrerit. Nam et lobortis mauris. Aenean imperdiet arcu at leo ullamcorper fermentum. Donec consequat sagittis pulvinar. Pellentesque vestibulum neque ut vulputate ullamcorper. Fusce dapibus ligula vitae tortor condimentum bibendum. Sed suscipit euismod felis non eleifend. Sed eu interdum diam. Etiam et nunc nulla. Nunc id velit luctus, fermentum nibh vitae, tincidunt orci. In tincidunt vulputate diam, id finibus dolor venenatis ac. Aliquam euismod hendrerit ligula at tincidunt. Nunc lacinia nulla a orci fringilla auctor. Aliquam et lacinia diam, a aliquam libero. Suspendisse malesuada purus ut efficitur efficitur.Sed ullamcorper erat at mi blandit scelerisque. Sed ante odio, suscipit ut ultrices sit amet, mollis vitae massa. Vestibulum suscipit fringilla libero, eu lacinia sem imperdiet quis. Nam venenatis feugiat risus et scelerisque. Phasellus sed viverra arcu. Phasellus hendrerit hendrerit ante, cursus condimentum urna malesuada vulputate. Nunc ultricies ante quis nisl pulvinar, vel viverra lorem volutpat. Aliquam suscipit diam a iaculis dignissim. Nulla risus leo, lobortis a turpis vel, porttitor tincidunt lectus. Sed nulla quam, eleifend ut mollis ac, sagittis in velit. Aliquam erat volutpat. Sed elementum risus et finibus tincidunt. Curabitur gravida erat nunc. Phasellus lacinia ullamcorper ligula non consectetur. Suspendisse volutpat blandit sem, vitae tempus ante malesuada non. In dui lorem, fringilla vitae dui eu, aliquet lobortis odio.Nunc sed iaculis eros, non commodo dolor. Aenean et dictum ex, quis pellentesque dolor. Maecenas ultrices felis elit, eget aliquet nunc vehicula vitae. Aenean suscipit egestas diam, eu finibus lacus faucibus ac. Duis sit.";
        String[] words = input.split(" ");
        Map<String, Integer> wordsCountMap = new HashMap<>();
        //перебираєм масив слів, якщо такого слова немає в мапі- додаємо в мапу як ключ, якщо є - додаємо до існуючого значення ключа +1
        for(String word: words) {
            word = word.replace(",", "").replace(".", "").toLowerCase();
            if (wordsCountMap.containsKey(word)) {
                wordsCountMap.put(word, wordsCountMap.get(word)+1);
            }else {
              wordsCountMap.put(word,1);
            }

        }
        System.out.println(wordsCountMap);

    }



}
