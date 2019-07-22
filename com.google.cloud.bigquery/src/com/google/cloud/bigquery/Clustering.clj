(ns com.google.cloud.bigquery.Clustering
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Clustering]))

(defn ->clustering
  "Constructor."
  (^Clustering []
    (new Clustering )))

(defn *new-builder
  "returns: `com.google.cloud.bigquery.Clustering$Builder`"
  (^com.google.cloud.bigquery.Clustering$Builder []
    (Clustering/newBuilder )))

(defn get-fields
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Clustering this]
    (-> this (.getFields))))

(defn to-builder
  "returns: `com.google.cloud.bigquery.Clustering$Builder`"
  (^com.google.cloud.bigquery.Clustering$Builder [^Clustering this]
    (-> this (.toBuilder))))

