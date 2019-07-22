(ns com.google.cloud.logging.SinkInfo$Destination$BucketDestination
  "Class for specifying a Google Cloud Storage bucket as destination for the sink."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging SinkInfo$Destination$BucketDestination]))

(defn *of
  "Creates a BucketDestination object given the name of the bucket to be used as sink
   destination.

  bucket - `java.lang.String`

  returns: `com.google.cloud.logging.SinkInfo$Destination$BucketDestination`"
  (^com.google.cloud.logging.SinkInfo$Destination$BucketDestination [^java.lang.String bucket]
    (SinkInfo$Destination$BucketDestination/of bucket)))

(defn get-bucket
  "Returns the name of the Google Cloud Storage bucket this destination represents.

  returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo$Destination$BucketDestination this]
    (-> this (.getBucket))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SinkInfo$Destination$BucketDestination this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SinkInfo$Destination$BucketDestination this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SinkInfo$Destination$BucketDestination this]
    (-> this (.toString))))

