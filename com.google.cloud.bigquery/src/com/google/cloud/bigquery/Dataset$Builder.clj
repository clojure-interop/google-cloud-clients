(ns com.google.cloud.bigquery.Dataset$Builder
  "A builder for Dataset objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Dataset$Builder]))

(defn set-dataset-id
  "Description copied from class: DatasetInfo.Builder

  dataset-id - `com.google.cloud.bigquery.DatasetId`

  returns: `com.google.cloud.bigquery.Dataset$Builder`"
  (^com.google.cloud.bigquery.Dataset$Builder [^Dataset$Builder this ^com.google.cloud.bigquery.DatasetId dataset-id]
    (-> this (.setDatasetId dataset-id))))

(defn set-acl
  "Description copied from class: DatasetInfo.Builder

  acl - `java.util.List`

  returns: `com.google.cloud.bigquery.Dataset$Builder`"
  (^com.google.cloud.bigquery.Dataset$Builder [^Dataset$Builder this ^java.util.List acl]
    (-> this (.setAcl acl))))

(defn set-default-table-lifetime
  "Description copied from class: DatasetInfo.Builder

  default-table-lifetime - `java.lang.Long`

  returns: `com.google.cloud.bigquery.Dataset$Builder`"
  (^com.google.cloud.bigquery.Dataset$Builder [^Dataset$Builder this ^java.lang.Long default-table-lifetime]
    (-> this (.setDefaultTableLifetime default-table-lifetime))))

(defn set-description
  "Description copied from class: DatasetInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.bigquery.Dataset$Builder`"
  (^com.google.cloud.bigquery.Dataset$Builder [^Dataset$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-friendly-name
  "Description copied from class: DatasetInfo.Builder

  friendly-name - `java.lang.String`

  returns: `com.google.cloud.bigquery.Dataset$Builder`"
  (^com.google.cloud.bigquery.Dataset$Builder [^Dataset$Builder this ^java.lang.String friendly-name]
    (-> this (.setFriendlyName friendly-name))))

(defn set-location
  "Description copied from class: DatasetInfo.Builder

  location - `java.lang.String`

  returns: `com.google.cloud.bigquery.Dataset$Builder`"
  (^com.google.cloud.bigquery.Dataset$Builder [^Dataset$Builder this ^java.lang.String location]
    (-> this (.setLocation location))))

(defn set-labels
  "labels - `java.util.Map`

  returns: `com.google.cloud.bigquery.Dataset$Builder`"
  (^com.google.cloud.bigquery.Dataset$Builder [^Dataset$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn build
  "Description copied from class: DatasetInfo.Builder

  returns: `com.google.cloud.bigquery.Dataset`"
  (^com.google.cloud.bigquery.Dataset [^Dataset$Builder this]
    (-> this (.build))))

