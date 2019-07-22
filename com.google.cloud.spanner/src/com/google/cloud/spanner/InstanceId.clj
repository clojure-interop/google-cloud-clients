(ns com.google.cloud.spanner.InstanceId
  "Represents the resource name of a Cloud Spanner Instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner InstanceId]))

(defn *of
  "Creates an InstanceId given project and instance IDs.

  project - `java.lang.String`
  instance - `java.lang.String`

  returns: `com.google.cloud.spanner.InstanceId`"
  (^com.google.cloud.spanner.InstanceId [^java.lang.String project ^java.lang.String instance]
    (InstanceId/of project instance)))

(defn get-instance
  "Returns the instance ID.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceId this]
    (-> this (.getInstance))))

(defn get-project
  "Returns the ID of the project that owns this instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceId this]
    (-> this (.getProject))))

(defn get-name
  "Returns the name of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceId this]
    (-> this (.getName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceId this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceId this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceId this]
    (-> this (.toString))))

