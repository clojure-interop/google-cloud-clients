(ns com.google.cloud.spanner.spi.v1.SpannerRpc$Option
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.spi.v1 SpannerRpc$Option]))

(def CHANNEL_HINT
  "Enum Constant.

  type: com.google.cloud.spanner.spi.v1.SpannerRpc$Option"
  SpannerRpc$Option/CHANNEL_HINT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SpannerRpc.Option c : SpannerRpc.Option.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.spanner.spi.v1.SpannerRpc$Option[]`"
  ([]
    (SpannerRpc$Option/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.spanner.spi.v1.SpannerRpc$Option`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.spanner.spi.v1.SpannerRpc$Option [^java.lang.String name]
    (SpannerRpc$Option/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SpannerRpc$Option this]
    (-> this (.toString))))

