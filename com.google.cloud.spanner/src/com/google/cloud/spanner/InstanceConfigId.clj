(ns com.google.cloud.spanner.InstanceConfigId
  "Returns id of a Cloud Spanner instance config."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner InstanceConfigId]))

(defn *of
  "Creates an InstanceConfigId given project and instance config IDs.

  project - `java.lang.String`
  instance-config - `java.lang.String`

  returns: `com.google.cloud.spanner.InstanceConfigId`"
  (^com.google.cloud.spanner.InstanceConfigId [^java.lang.String project ^java.lang.String instance-config]
    (InstanceConfigId/of project instance-config)))

(defn get-project
  "Returns project of this instane config.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceConfigId this]
    (-> this (.getProject))))

(defn get-instance-config
  "Returns id of this instance config.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceConfigId this]
    (-> this (.getInstanceConfig))))

(defn get-name
  "Returns the name of the instance config.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceConfigId this]
    (-> this (.getName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceConfigId this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceConfigId this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceConfigId this]
    (-> this (.toString))))

