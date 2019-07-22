(ns com.google.cloud.bigquery.Model$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery Model$Builder]))

(defn set-description
  "Description copied from class: ModelInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.bigquery.Model$Builder`"
  (^com.google.cloud.bigquery.Model$Builder [^Model$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-expiration-time
  "Description copied from class: ModelInfo.Builder

  expiration-time - `java.lang.Long`

  returns: `com.google.cloud.bigquery.Model$Builder`"
  (^com.google.cloud.bigquery.Model$Builder [^Model$Builder this ^java.lang.Long expiration-time]
    (-> this (.setExpirationTime expiration-time))))

(defn set-friendly-name
  "Description copied from class: ModelInfo.Builder

  friendly-name - `java.lang.String`

  returns: `com.google.cloud.bigquery.Model$Builder`"
  (^com.google.cloud.bigquery.Model$Builder [^Model$Builder this ^java.lang.String friendly-name]
    (-> this (.setFriendlyName friendly-name))))

(defn set-model-id
  "model-id - `com.google.cloud.bigquery.ModelId`

  returns: `com.google.cloud.bigquery.Model$Builder`"
  (^com.google.cloud.bigquery.Model$Builder [^Model$Builder this ^com.google.cloud.bigquery.ModelId model-id]
    (-> this (.setModelId model-id))))

(defn set-labels
  "Description copied from class: ModelInfo.Builder

  labels - `java.util.Map`

  returns: `com.google.cloud.bigquery.Model$Builder`"
  (^com.google.cloud.bigquery.Model$Builder [^Model$Builder this ^java.util.Map labels]
    (-> this (.setLabels labels))))

(defn build
  "Description copied from class: ModelInfo.Builder

  returns: `com.google.cloud.bigquery.Model`"
  (^com.google.cloud.bigquery.Model [^Model$Builder this]
    (-> this (.build))))

