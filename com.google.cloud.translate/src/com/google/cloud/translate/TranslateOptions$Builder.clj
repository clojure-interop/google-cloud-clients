(ns com.google.cloud.translate.TranslateOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate TranslateOptions$Builder]))

(defn get-credentials
  "Returns the authentication credentials.

  returns: `com.google.auth.Credentials`"
  (^com.google.auth.Credentials [^TranslateOptions$Builder this]
    (-> this (.getCredentials))))

(defn set-transport-options
  "Description copied from class: ServiceOptions.Builder

  transport-options - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.translate.TranslateOptions$Builder`"
  (^com.google.cloud.translate.TranslateOptions$Builder [^TranslateOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn set-project-id
  "Sets the project ID. Setting a project ID has no impact on the Translate service.

  project-id - `java.lang.String`

  returns: the builder - `com.google.cloud.translate.TranslateOptions$Builder`"
  (^com.google.cloud.translate.TranslateOptions$Builder [^TranslateOptions$Builder this ^java.lang.String project-id]
    (-> this (.setProjectId project-id))))

(defn set-api-key
  "Deprecated.

  api-key - `java.lang.String`

  returns: `com.google.cloud.translate.TranslateOptions$Builder`"
  (^com.google.cloud.translate.TranslateOptions$Builder [^TranslateOptions$Builder this ^java.lang.String api-key]
    (-> this (.setApiKey api-key))))

(defn set-target-language
  "Sets the code for the default target language. If not set, English (en) is used.
   Calls to Translate.translate(List, TranslateOption...) and Translate.translate(String, TranslateOption...) will use this value unless an option from
   Translate.TranslateOption.targetLanguage(String) is explicitly provided.

  target-language - `java.lang.String`

  returns: the builder - `com.google.cloud.translate.TranslateOptions$Builder`"
  (^com.google.cloud.translate.TranslateOptions$Builder [^TranslateOptions$Builder this ^java.lang.String target-language]
    (-> this (.setTargetLanguage target-language))))

(defn build
  "returns: `com.google.cloud.translate.TranslateOptions`"
  (^com.google.cloud.translate.TranslateOptions [^TranslateOptions$Builder this]
    (-> this (.build))))

