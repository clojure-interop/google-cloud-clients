(ns com.google.cloud.compute.deprecated.DeprecationStatus$Builder
  "A builder for DeprecationStatus objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DeprecationStatus$Builder]))

(defn set-deleted
  "Sets the timestamp on or after which the deprecation state of this resource will be changed
   to DeprecationStatus.Status.DELETED. In milliseconds since epoch.

  deleted - `long`

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus$Builder<T>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^Long deleted]
    (-> this (.setDeleted deleted))))

(defn set-deprecated
  "Sets the timestamp on or after which the deprecation state of this resource will be changed
   to DeprecationStatus.Status.DEPRECATED. In milliseconds since epoch.

  deprecated - `long`

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus$Builder<T>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^Long deprecated]
    (-> this (.setDeprecated deprecated))))

(defn set-obsolete
  "Sets the timestamp on or after which the deprecation state of this resource will be changed
   to DeprecationStatus.Status.OBSOLETE. In milliseconds since epoch.

  obsolete - `long`

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus$Builder<T>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^Long obsolete]
    (-> this (.setObsolete obsolete))))

(defn set-replacement
  "Sets the identity of the suggested replacement for a deprecated resource. The suggested
   replacement resource must be the same kind of resource as the deprecated resource.

  replacement - `T`

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus$Builder<T>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus$Builder [^DeprecationStatus$Builder this replacement]
    (-> this (.setReplacement replacement))))

(defn set-status
  "Sets the status of the deprecated resource.

  status - `com.google.cloud.compute.deprecated.DeprecationStatus$Status`

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus$Builder<T>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^com.google.cloud.compute.deprecated.DeprecationStatus$Status status]
    (-> this (.setStatus status))))

(defn build
  "Creates a DeprecationStatus object.

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus<T>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus [^DeprecationStatus$Builder this]
    (-> this (.build))))

