(ns com.google.cloud.dns.ProjectInfo
  "The class provides the Google Cloud DNS information associated with this project. A project is a
  top level container for resources including Zones. Projects can be created only in the
  APIs console."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dns ProjectInfo]))

(defn get-quota
  "Returns the Quota object which contains quotas assigned to this project.

  returns: `com.google.cloud.dns.ProjectInfo$Quota`"
  (^com.google.cloud.dns.ProjectInfo$Quota [^ProjectInfo this]
    (-> this (.getQuota))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectInfo this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectInfo this]
    (-> this (.toString))))

