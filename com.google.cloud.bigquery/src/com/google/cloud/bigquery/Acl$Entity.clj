(ns com.google.cloud.bigquery.Acl$Entity
  "Base class for BigQuery entities that can be grant access to the dataset."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Acl$Entity]))

(defn get-type
  "returns: `com.google.cloud.bigquery.Acl$Entity$Type`"
  (^com.google.cloud.bigquery.Acl$Entity$Type [^Acl$Entity this]
    (-> this (.getType))))

