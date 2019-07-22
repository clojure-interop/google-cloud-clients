(ns com.google.cloud.logging.SinkInfo$Destination$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SinkInfo$Destination$Type]))

(def BUCKET
  "Enum Constant.

  Specifies a Google Cloud Storage bucket as destination for the sink.

  type: com.google.cloud.logging.SinkInfo$Destination$Type"
  SinkInfo$Destination$Type/BUCKET)

(def DATASET
  "Enum Constant.

  Specifies a Google Cloud BigQuery dataset as destination for the sink.

  type: com.google.cloud.logging.SinkInfo$Destination$Type"
  SinkInfo$Destination$Type/DATASET)

(def TOPIC
  "Enum Constant.

  Specifies a Google Cloud Pub/Sub topic as destination for the sink.

  type: com.google.cloud.logging.SinkInfo$Destination$Type"
  SinkInfo$Destination$Type/TOPIC)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (SinkInfo.Destination.Type c : SinkInfo.Destination.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.logging.SinkInfo$Destination$Type[]`"
  ([]
    (SinkInfo$Destination$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.logging.SinkInfo$Destination$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.logging.SinkInfo$Destination$Type [^java.lang.String name]
    (SinkInfo$Destination$Type/valueOf name)))

