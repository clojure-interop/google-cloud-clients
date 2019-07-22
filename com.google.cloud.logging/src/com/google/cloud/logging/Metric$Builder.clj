(ns com.google.cloud.logging.Metric$Builder
  "A builder for Metric objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Metric$Builder]))

(defn set-name
  "Description copied from class: MetricInfo.Builder

  name - `java.lang.String`

  returns: `com.google.cloud.logging.Metric$Builder`"
  (^com.google.cloud.logging.Metric$Builder [^Metric$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-description
  "Description copied from class: MetricInfo.Builder

  description - `java.lang.String`

  returns: `com.google.cloud.logging.Metric$Builder`"
  (^com.google.cloud.logging.Metric$Builder [^Metric$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-filter
  "Description copied from class: MetricInfo.Builder

  filter - `java.lang.String`

  returns: `com.google.cloud.logging.Metric$Builder`"
  (^com.google.cloud.logging.Metric$Builder [^Metric$Builder this ^java.lang.String filter]
    (-> this (.setFilter filter))))

(defn build
  "Description copied from class: MetricInfo.Builder

  returns: `com.google.cloud.logging.Metric`"
  (^com.google.cloud.logging.Metric [^Metric$Builder this]
    (-> this (.build))))

