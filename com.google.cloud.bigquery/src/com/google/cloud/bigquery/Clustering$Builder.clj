(ns com.google.cloud.bigquery.Clustering$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Clustering$Builder]))

(defn ->builder
  "Constructor."
  (^Clustering$Builder []
    (new Clustering$Builder )))

(defn set-fields
  "fields - `java.util.List`

  returns: `com.google.cloud.bigquery.Clustering$Builder`"
  (^com.google.cloud.bigquery.Clustering$Builder [^Clustering$Builder this ^java.util.List fields]
    (-> this (.setFields fields))))

(defn build
  "returns: `com.google.cloud.bigquery.Clustering`"
  (^com.google.cloud.bigquery.Clustering [^Clustering$Builder this]
    (-> this (.build))))

