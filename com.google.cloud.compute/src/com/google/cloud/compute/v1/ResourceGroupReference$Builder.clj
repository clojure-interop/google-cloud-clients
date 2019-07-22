(ns com.google.cloud.compute.v1.ResourceGroupReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ResourceGroupReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ResourceGroupReference`

  returns: `com.google.cloud.compute.v1.ResourceGroupReference$Builder`"
  (^com.google.cloud.compute.v1.ResourceGroupReference$Builder [^ResourceGroupReference$Builder this ^com.google.cloud.compute.v1.ResourceGroupReference other]
    (-> this (.mergeFrom other))))

(defn get-group
  "A URI referencing one of the instance groups or network endpoint groups listed in the backend
   service.

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceGroupReference$Builder this]
    (-> this (.getGroup))))

(defn set-group
  "A URI referencing one of the instance groups or network endpoint groups listed in the backend
   service.

  group - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ResourceGroupReference$Builder`"
  (^com.google.cloud.compute.v1.ResourceGroupReference$Builder [^ResourceGroupReference$Builder this ^java.lang.String group]
    (-> this (.setGroup group))))

(defn build
  "returns: `com.google.cloud.compute.v1.ResourceGroupReference`"
  (^com.google.cloud.compute.v1.ResourceGroupReference [^ResourceGroupReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ResourceGroupReference$Builder`"
  (^com.google.cloud.compute.v1.ResourceGroupReference$Builder [^ResourceGroupReference$Builder this]
    (-> this (.clone))))

