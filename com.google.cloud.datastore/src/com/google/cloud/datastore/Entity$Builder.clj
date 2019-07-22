(ns com.google.cloud.datastore.Entity$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.datastore Entity$Builder]))

(defn set-key
  "Description copied from class: BaseEntity.Builder

  key - `com.google.cloud.datastore.Key`

  returns: `com.google.cloud.datastore.Entity$Builder`"
  (^com.google.cloud.datastore.Entity$Builder [^Entity$Builder this ^com.google.cloud.datastore.Key key]
    (-> this (.setKey key))))

(defn build
  "returns: `com.google.cloud.datastore.Entity`"
  (^com.google.cloud.datastore.Entity [^Entity$Builder this]
    (-> this (.build))))

