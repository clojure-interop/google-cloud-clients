(ns com.google.cloud.logging.Sink$Builder
  "A builder for Sink objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging Sink$Builder]))

(defn set-name
  "Description copied from class: SinkInfo.Builder

  name - `java.lang.String`

  returns: `com.google.cloud.logging.Sink$Builder`"
  (^com.google.cloud.logging.Sink$Builder [^Sink$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-destination
  "Description copied from class: SinkInfo.Builder

  destination - `com.google.cloud.logging.SinkInfo$Destination`

  returns: `com.google.cloud.logging.Sink$Builder`"
  (^com.google.cloud.logging.Sink$Builder [^Sink$Builder this ^com.google.cloud.logging.SinkInfo$Destination destination]
    (-> this (.setDestination destination))))

(defn set-filter
  "Description copied from class: SinkInfo.Builder

  filter - `java.lang.String`

  returns: `com.google.cloud.logging.Sink$Builder`"
  (^com.google.cloud.logging.Sink$Builder [^Sink$Builder this ^java.lang.String filter]
    (-> this (.setFilter filter))))

(defn set-version-format
  "Description copied from class: SinkInfo.Builder

  version-format - `com.google.cloud.logging.SinkInfo$VersionFormat`

  returns: `com.google.cloud.logging.Sink$Builder`"
  (^com.google.cloud.logging.Sink$Builder [^Sink$Builder this ^com.google.cloud.logging.SinkInfo$VersionFormat version-format]
    (-> this (.setVersionFormat version-format))))

(defn build
  "Description copied from class: SinkInfo.Builder

  returns: `com.google.cloud.logging.Sink`"
  (^com.google.cloud.logging.Sink [^Sink$Builder this]
    (-> this (.build))))

