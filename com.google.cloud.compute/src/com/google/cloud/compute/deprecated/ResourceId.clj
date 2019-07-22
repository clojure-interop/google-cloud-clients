(ns com.google.cloud.compute.deprecated.ResourceId
  "Base class for Google Compute Engine resource identities."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ResourceId]))

(defn get-self-link
  "Returns a fully qualified URL to the entity.

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceId this]
    (-> this (.getSelfLink))))

(defn get-project
  "Returns the name of the project.

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceId this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ResourceId this]
    (-> this (.toString))))

