(ns com.google.cloud.datastore.IncompleteKey
  "An incomplete key (without a name or id). This class is immutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore IncompleteKey]))

(defn *new-builder
  "project-id - `java.lang.String`
  kind - `java.lang.String`

  returns: `com.google.cloud.datastore.IncompleteKey$Builder`"
  (^com.google.cloud.datastore.IncompleteKey$Builder [^java.lang.String project-id ^java.lang.String kind]
    (IncompleteKey/newBuilder project-id kind))
  (^com.google.cloud.datastore.IncompleteKey$Builder [^com.google.cloud.datastore.IncompleteKey copy-from]
    (IncompleteKey/newBuilder copy-from)))

(defn get-parent
  "Returns the key's parent.

  returns: `com.google.cloud.datastore.Key`"
  (^com.google.cloud.datastore.Key [^IncompleteKey this]
    (-> this (.getParent))))

