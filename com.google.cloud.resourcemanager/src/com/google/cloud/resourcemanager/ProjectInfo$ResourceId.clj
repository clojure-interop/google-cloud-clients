(ns com.google.cloud.resourcemanager.ProjectInfo$ResourceId
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.resourcemanager ProjectInfo$ResourceId]))

(defn *of
  "id - `java.lang.String`
  type - `java.lang.String`

  returns: `com.google.cloud.resourcemanager.ProjectInfo$ResourceId`"
  (^com.google.cloud.resourcemanager.ProjectInfo$ResourceId [^java.lang.String id ^java.lang.String type]
    (ProjectInfo$ResourceId/of id type)))

(defn get-id
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectInfo$ResourceId this]
    (-> this (.getId))))

(defn get-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectInfo$ResourceId this]
    (-> this (.getType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectInfo$ResourceId this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectInfo$ResourceId this]
    (-> this (.hashCode))))

