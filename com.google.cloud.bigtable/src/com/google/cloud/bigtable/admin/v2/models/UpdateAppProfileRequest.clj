(ns com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest
  "Parameters for updating an existing Cloud Bigtable app profile.

  Examples



  AppProfile existingAppProfile = ...;
  UpdateAppProfileRequest appProfileRequest = UpdateAppProfileRequest.of(existingAppProfile)
    .setRoutingPolicy(SingleClusterRoutingPolicy.of(\"my-cluster\"));"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models UpdateAppProfileRequest]))

(defn *of
  "Builds a new update request using an existing AppProfile.

  instance-id - `java.lang.String`
  app-profile-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest [^java.lang.String instance-id ^java.lang.String app-profile-id]
    (UpdateAppProfileRequest/of instance-id app-profile-id))
  (^com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest [^com.google.cloud.bigtable.admin.v2.models.AppProfile app-profile]
    (UpdateAppProfileRequest/of app-profile)))

(defn set-ignore-warnings
  "Configures if safety warnings should be disabled.

  value - `boolean`

  returns: `com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest [^UpdateAppProfileRequest this ^Boolean value]
    (-> this (.setIgnoreWarnings value))))

(defn set-description
  "Sets the optional long form description of the use case for the AppProfile.

  description - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest [^UpdateAppProfileRequest this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-routing-policy
  "Sets the routing policy for all read/write requests that use this app profile.

  routing-policy - `com.google.cloud.bigtable.admin.v2.models.AppProfile$RoutingPolicy`

  returns: `com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.UpdateAppProfileRequest [^UpdateAppProfileRequest this ^com.google.cloud.bigtable.admin.v2.models.AppProfile$RoutingPolicy routing-policy]
    (-> this (.setRoutingPolicy routing-policy))))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  project-id - `java.lang.String`

  returns: `com.google.bigtable.admin.v2.UpdateAppProfileRequest`"
  (^com.google.bigtable.admin.v2.UpdateAppProfileRequest [^UpdateAppProfileRequest this ^java.lang.String project-id]
    (-> this (.toProto project-id))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UpdateAppProfileRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UpdateAppProfileRequest this]
    (-> this (.hashCode))))

