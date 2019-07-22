(ns com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest
  "Parameters for updating an existing Bigtable instance.

  Existing instances maybe updated to change their superficial appearance (ie. display name) and
  can also be upgraded from a DEVELOPMENT instance to a PRODUCTION instance. Please note that
  upgrading to a PRODUCTION instance cannot be undone."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models UpdateInstanceRequest]))

(defn *of
  "Builds a new request to update an existing instance with the specified id.

  instance-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest [^java.lang.String instance-id]
    (UpdateInstanceRequest/of instance-id)))

(defn set-display-name
  "Changes the display name of the instance.

  display-name - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest [^UpdateInstanceRequest this ^java.lang.String display-name]
    (-> this (.setDisplayName display-name))))

(defn set-production-type
  "Upgrades the instance from a DEVELOPMENT instance to a PRODUCTION instance. This cannot be
   undone.

  returns: `com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest [^UpdateInstanceRequest this]
    (-> this (.setProductionType))))

(defn set-all-labels
  "Replaces the labels associated with the instance.

  labels - `java.util.Map`

  returns: `com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.UpdateInstanceRequest [^UpdateInstanceRequest this ^java.util.Map labels]
    (-> this (.setAllLabels labels))))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  project-id - `java.lang.String`

  returns: `com.google.bigtable.admin.v2.PartialUpdateInstanceRequest`"
  (^com.google.bigtable.admin.v2.PartialUpdateInstanceRequest [^UpdateInstanceRequest this ^java.lang.String project-id]
    (-> this (.toProto project-id))))

