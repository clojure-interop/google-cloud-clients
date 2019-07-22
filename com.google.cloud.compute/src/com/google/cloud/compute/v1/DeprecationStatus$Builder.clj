(ns com.google.cloud.compute.v1.DeprecationStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 DeprecationStatus$Builder]))

(defn get-replacement
  "The URL of the suggested replacement for a deprecated resource. The suggested replacement
   resource must be the same kind of resource as the deprecated resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus$Builder this]
    (-> this (.getReplacement))))

(defn get-obsolete
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to OBSOLETE. This is only informational and the status will not change unless the
   client explicitly changes it.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus$Builder this]
    (-> this (.getObsolete))))

(defn set-deleted
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to DELETED. This is only informational and the status will not change unless the
   client explicitly changes it.

  deleted - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^java.lang.String deleted]
    (-> this (.setDeleted deleted))))

(defn set-replacement
  "The URL of the suggested replacement for a deprecated resource. The suggested replacement
   resource must be the same kind of resource as the deprecated resource.

  replacement - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^java.lang.String replacement]
    (-> this (.setReplacement replacement))))

(defn set-state
  "The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED.
   Operations which communicate the end of life date for an image, can use ACTIVE. Operations
   which create a new resource using a DEPRECATED resource will return successfully, but with a
   warning indicating the deprecated resource and recommending its replacement. Operations which
   use OBSOLETE or DELETED resources will be rejected and result in an error.

  state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^java.lang.String state]
    (-> this (.setState state))))

(defn get-state
  "The deprecation state of this resource. This can be ACTIVE, DEPRECATED, OBSOLETE, or DELETED.
   Operations which communicate the end of life date for an image, can use ACTIVE. Operations
   which create a new resource using a DEPRECATED resource will return successfully, but with a
   warning indicating the deprecated resource and recommending its replacement. Operations which
   use OBSOLETE or DELETED resources will be rejected and result in an error.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus$Builder this]
    (-> this (.getState))))

(defn get-deprecated
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to DEPRECATED. This is only informational and the status will not change unless the
   client explicitly changes it.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus$Builder this]
    (-> this (.getDeprecated))))

(defn get-deleted
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to DELETED. This is only informational and the status will not change unless the
   client explicitly changes it.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus$Builder this]
    (-> this (.getDeleted))))

(defn set-obsolete
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to OBSOLETE. This is only informational and the status will not change unless the
   client explicitly changes it.

  obsolete - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^java.lang.String obsolete]
    (-> this (.setObsolete obsolete))))

(defn build
  "returns: `com.google.cloud.compute.v1.DeprecationStatus`"
  (^com.google.cloud.compute.v1.DeprecationStatus [^DeprecationStatus$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.DeprecationStatus`

  returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^com.google.cloud.compute.v1.DeprecationStatus other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^DeprecationStatus$Builder this]
    (-> this (.clone))))

(defn set-deprecated
  "An optional RFC3339 timestamp on or after which the state of this resource is intended to
   change to DEPRECATED. This is only informational and the status will not change unless the
   client explicitly changes it.

  deprecated - `java.lang.String`

  returns: `com.google.cloud.compute.v1.DeprecationStatus$Builder`"
  (^com.google.cloud.compute.v1.DeprecationStatus$Builder [^DeprecationStatus$Builder this ^java.lang.String deprecated]
    (-> this (.setDeprecated deprecated))))

