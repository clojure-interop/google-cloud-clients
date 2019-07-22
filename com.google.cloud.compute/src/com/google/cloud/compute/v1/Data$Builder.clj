(ns com.google.cloud.compute.v1.Data$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Data$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Data`

  returns: `com.google.cloud.compute.v1.Data$Builder`"
  (^com.google.cloud.compute.v1.Data$Builder [^Data$Builder this ^com.google.cloud.compute.v1.Data other]
    (-> this (.mergeFrom other))))

(defn get-key
  "[Output Only] A key that provides more detail on the warning being returned. For example, for
   warnings where there are no results in a list request for a particular zone, this key might
   be scope and the key value might be the zone name. Other examples might be a key indicating a
   deprecated resource and a suggested replacement, or a warning about invalid network settings
   (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
   forwarding).

  returns: `java.lang.String`"
  (^java.lang.String [^Data$Builder this]
    (-> this (.getKey))))

(defn set-key
  "[Output Only] A key that provides more detail on the warning being returned. For example, for
   warnings where there are no results in a list request for a particular zone, this key might
   be scope and the key value might be the zone name. Other examples might be a key indicating a
   deprecated resource and a suggested replacement, or a warning about invalid network settings
   (for example, if an instance attempts to perform IP forwarding but is not enabled for IP
   forwarding).

  key - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Data$Builder`"
  (^com.google.cloud.compute.v1.Data$Builder [^Data$Builder this ^java.lang.String key]
    (-> this (.setKey key))))

(defn get-value
  "[Output Only] A warning data value corresponding to the key.

  returns: `java.lang.String`"
  (^java.lang.String [^Data$Builder this]
    (-> this (.getValue))))

(defn set-value
  "[Output Only] A warning data value corresponding to the key.

  value - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Data$Builder`"
  (^com.google.cloud.compute.v1.Data$Builder [^Data$Builder this ^java.lang.String value]
    (-> this (.setValue value))))

(defn build
  "returns: `com.google.cloud.compute.v1.Data`"
  (^com.google.cloud.compute.v1.Data [^Data$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Data$Builder`"
  (^com.google.cloud.compute.v1.Data$Builder [^Data$Builder this]
    (-> this (.clone))))

