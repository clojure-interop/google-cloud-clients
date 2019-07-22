(ns com.google.cloud.translate.TranslateOptions
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate TranslateOptions]))

(def *-api-key-env-name
  "Static Constant.

  type: java.lang.String"
  TranslateOptions/API_KEY_ENV_NAME)

(defn *get-default-http-transport-options
  "returns: `com.google.cloud.http.HttpTransportOptions`"
  (^com.google.cloud.http.HttpTransportOptions []
    (TranslateOptions/getDefaultHttpTransportOptions )))

(defn *get-default-api-key
  "returns: `java.lang.String`"
  (^java.lang.String []
    (TranslateOptions/getDefaultApiKey )))

(defn *get-default-instance
  "Returns a default TranslateOptions instance.

  returns: `com.google.cloud.translate.TranslateOptions`"
  (^com.google.cloud.translate.TranslateOptions []
    (TranslateOptions/getDefaultInstance )))

(defn *new-builder
  "Returns a builder for TranslateOptions objects.

  returns: `com.google.cloud.translate.TranslateOptions$Builder`"
  (^com.google.cloud.translate.TranslateOptions$Builder []
    (TranslateOptions/newBuilder )))

(defn get-api-key
  "Returns the API key to be used to send requests.

  returns: `java.lang.String`"
  (^java.lang.String [^TranslateOptions this]
    (-> this (.getApiKey))))

(defn get-target-language
  "Returns the code for the default target language.

  returns: `java.lang.String`"
  (^java.lang.String [^TranslateOptions this]
    (-> this (.getTargetLanguage))))

(defn to-builder
  "returns: `com.google.cloud.translate.TranslateOptions$Builder`"
  (^com.google.cloud.translate.TranslateOptions$Builder [^TranslateOptions this]
    (-> this (.toBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TranslateOptions this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TranslateOptions this ^java.lang.Object obj]
    (-> this (.equals obj))))

