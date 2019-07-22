(ns com.google.cloud.translate.Translate
  "An interface for Google Translation. Translate and its Option classes can be used
  concurrently without external synchronizations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate Translate]))

(defn list-supported-languages
  "Returns the list of languages supported by Google Translation. If an option from Translate.LanguageListOption.targetLanguage(String) is provided, the value of Language.getName()
   is localized according to the provided target language. If no such option is passed, the value
   of Language.getName() is localized according to TranslateOptions.getTargetLanguage().

   Example of listing supported languages, localized according to TranslateOptions.getTargetLanguage():
   SNIPPET translate_list_codes



   // TODO(developer): Uncomment these lines.
   // import com.google.cloud.translate.*;
   // Translate translate = TranslateOptions.getDefaultInstance().getService();

   List<Language> languages = translate.listSupportedLanguages();

   for (Language language : languages) {
     System.out.printf(\"Name: %s, Code: %s\\n\", language.getName(), language.getCode());
   }

   SNIPPET translate_list_codes

   Example of listing supported languages, localized according to a provided language:
   SNIPPET translate_list_language_names



   // TODO(developer): Uncomment these lines.
   // import com.google.cloud.translate.*;
   // Translate translate = TranslateOptions.getDefaultInstance().getService();

   List<Language> languages = translate.listSupportedLanguages(
           Translate.LanguageListOption.targetLanguage(\"es\"));

   for (Language language : languages) {
     System.out.printf(\"Name: %s, Code: %s\\n\", language.getName(), language.getCode());
   }

   SNIPPET translate_list_language_names

  options - `com.google.cloud.translate.Translate$LanguageListOption`

  returns: `java.util.List<com.google.cloud.translate.Language>`"
  (^java.util.List [^Translate this ^com.google.cloud.translate.Translate$LanguageListOption options]
    (-> this (.listSupportedLanguages options))))

(defn detect
  "Detects the language of the provided texts.

   Example of detecting the language of some texts:
   SNIPPET translate_detect_language



   // TODO(developer): Uncomment these lines.
   // import com.google.cloud.translate.*;
   // Translate translate = TranslateOptions.getDefaultInstance().getService();

   List<String> texts = new LinkedList<>();
   texts.add(\"Hello, World!\");
   texts.add(\"¡Hola Mundo!\");
   List<Detection> detections = translate.detect(texts);

   System.out.println(\"Language(s) detected:\");
   for (Detection detection : detections) {
     System.out.printf(\"\\t%s\\n\", detection);
   }

   SNIPPET translate_detect_language

  texts - the texts for which language should be detected - `java.util.List`

  returns: a list of objects containing information on the language detection, one for each
       provided text, in order - `java.util.List<com.google.cloud.translate.Detection>`"
  (^java.util.List [^Translate this ^java.util.List texts]
    (-> this (.detect texts))))

(defn translate
  "Translates the provided texts.

   Example of translating some texts:
   SNIPPET translateTexts



   List<String> texts = new LinkedList<>();
   texts.add(\"Hello, World!\");
   texts.add(\"¡Hola Mundo!\");
   List<Translation> translations = translate.translate(texts);

   SNIPPET translateTexts

   Example of translating some texts, specifying source and target language:
   SNIPPET translateTextsWithOptions



   List<String> texts = new LinkedList<>();
   texts.add(\"¡Hola Mundo!\");
   List<Translation> translations = translate.translate(
       texts,
       Translate.TranslateOption.sourceLanguage(\"es\"),
       Translate.TranslateOption.targetLanguage(\"de\"));

   SNIPPET translateTextsWithOptions

  texts - the texts to translate - `java.util.List`
  options - `com.google.cloud.translate.Translate$TranslateOption`

  returns: a list of objects containing information on the language translation, one for each
       provided text, in order - `java.util.List<com.google.cloud.translate.Translation>`

  throws: com.google.cloud.translate.TranslateException - upon failure or if Translate.TranslateOption.model(String) is used by a non-whitelisted user"
  (^java.util.List [^Translate this ^java.util.List texts ^com.google.cloud.translate.Translate$TranslateOption options]
    (-> this (.translate texts options))))

