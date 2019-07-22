(ns com.google.cloud.compute.v1.TargetReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetReference`

  returns: `com.google.cloud.compute.v1.TargetReference$Builder`"
  (^com.google.cloud.compute.v1.TargetReference$Builder [^TargetReference$Builder this ^com.google.cloud.compute.v1.TargetReference other]
    (-> this (.mergeFrom other))))

(defn get-target
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetReference$Builder this]
    (-> this (.getTarget))))

(defn set-target
  "target - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetReference$Builder`"
  (^com.google.cloud.compute.v1.TargetReference$Builder [^TargetReference$Builder this ^java.lang.String target]
    (-> this (.setTarget target))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetReference`"
  (^com.google.cloud.compute.v1.TargetReference [^TargetReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetReference$Builder`"
  (^com.google.cloud.compute.v1.TargetReference$Builder [^TargetReference$Builder this]
    (-> this (.clone))))

