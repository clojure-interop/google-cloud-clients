(ns com.google.cloud.compute.deprecated.Tags
  "A list of tags for a Google Compute Engine Instance; with associated fingerprint. Tags are used
  to identify valid sources or targets for network firewalls and are specified by the client during
  instance creation. Each tag within the list must comply with RFC1035."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Tags]))

(defn *new-builder
  "Returns a builder for a Tags object given the tags to apply to the instance. Each tag
   within the list must comply with RFC1035.

  values - `java.lang.Iterable`

  returns: `com.google.cloud.compute.deprecated.Tags$Builder`"
  (^com.google.cloud.compute.deprecated.Tags$Builder [^java.lang.Iterable values]
    (Tags/newBuilder values)))

(defn *of
  "Returns a Tags object given the tags to apply to the instance. Each tag within the list
   must comply with RFC1035.

  values - `java.lang.Iterable`

  returns: `com.google.cloud.compute.deprecated.Tags`"
  (^com.google.cloud.compute.deprecated.Tags [^java.lang.Iterable values]
    (Tags/of values)))

(defn get-values
  "Returns a list of tags to apply to an instance. Tags are used to identify valid sources or
   targets for network firewalls. Each tag within the list must comply with RFC1035.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Tags this]
    (-> this (.getValues))))

(defn get-fingerprint
  "Returns the fingerprint for the tags. This value is needed to update instance's tags.

  returns: `java.lang.String`"
  (^java.lang.String [^Tags this]
    (-> this (.getFingerprint))))

(defn to-builder
  "Returns a builder for the current instance tags.

  returns: `com.google.cloud.compute.deprecated.Tags$Builder`"
  (^com.google.cloud.compute.deprecated.Tags$Builder [^Tags this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Tags this]
    (-> this (.toString))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Tags this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Tags this ^java.lang.Object obj]
    (-> this (.equals obj))))

