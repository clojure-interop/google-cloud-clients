(ns com.google.cloud.translate.spi.v2.TranslateRpc$Option
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.translate.spi.v2 TranslateRpc$Option]))

(def SOURCE_LANGUAGE
  "Enum Constant.

  type: com.google.cloud.translate.spi.v2.TranslateRpc$Option"
  TranslateRpc$Option/SOURCE_LANGUAGE)

(def TARGET_LANGUAGE
  "Enum Constant.

  type: com.google.cloud.translate.spi.v2.TranslateRpc$Option"
  TranslateRpc$Option/TARGET_LANGUAGE)

(def MODEL
  "Enum Constant.

  type: com.google.cloud.translate.spi.v2.TranslateRpc$Option"
  TranslateRpc$Option/MODEL)

(def FORMAT
  "Enum Constant.

  type: com.google.cloud.translate.spi.v2.TranslateRpc$Option"
  TranslateRpc$Option/FORMAT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TranslateRpc.Option c : TranslateRpc.Option.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.translate.spi.v2.TranslateRpc$Option[]`"
  ([]
    (TranslateRpc$Option/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.translate.spi.v2.TranslateRpc$Option`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.translate.spi.v2.TranslateRpc$Option [^java.lang.String name]
    (TranslateRpc$Option/valueOf name)))

(defn value
  "returns: `java.lang.String`"
  (^java.lang.String [^TranslateRpc$Option this]
    (-> this (.value))))

