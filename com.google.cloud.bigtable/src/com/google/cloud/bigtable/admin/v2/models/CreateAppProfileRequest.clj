(ns com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest
  "Parameters for creating a new Cloud Bigtable app profile.

  An application profile, or app profile, stores settings that tell your Cloud Bigtable instance
  how to handle incoming requests from an application. When one of your applications connects to a
  Cloud Bigtable instance, it can specify an app profile, and Cloud Bigtable uses that app profile
  for any requests that the application sends over that connection.

  Sample code:



  AppProfile existingAppProfile = ...;
  CreateAppProfileRequest appProfileRequest = CreateAppProfileRequest.of(\"my-instance\", \"my-new-app-profile\")
    .setRoutingPolicy(SingleClusterRoutingPolicy.of(\"my-cluster\"));"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models CreateAppProfileRequest]))

(defn *of
  "Builds a new request to create a new app profile in the specified instance.

  instance-id - `java.lang.String`
  app-profile-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest [^java.lang.String instance-id ^java.lang.String app-profile-id]
    (CreateAppProfileRequest/of instance-id app-profile-id)))

(defn set-ignore-warnings
  "Configures if safety warnings should be disabled.

  value - `boolean`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest [^CreateAppProfileRequest this ^Boolean value]
    (-> this (.setIgnoreWarnings value))))

(defn set-description
  "Sets the optional long form description of the use case for the AppProfile.

  description - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest [^CreateAppProfileRequest this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-routing-policy
  "Sets the routing policy for all read/write requests that use this app profile.

  routing-policy - `com.google.cloud.bigtable.admin.v2.models.AppProfile$RoutingPolicy`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateAppProfileRequest [^CreateAppProfileRequest this ^com.google.cloud.bigtable.admin.v2.models.AppProfile$RoutingPolicy routing-policy]
    (-> this (.setRoutingPolicy routing-policy))))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  project-id - `java.lang.String`

  returns: `com.google.bigtable.admin.v2.CreateAppProfileRequest`"
  (^com.google.bigtable.admin.v2.CreateAppProfileRequest [^CreateAppProfileRequest this ^java.lang.String project-id]
    (-> this (.toProto project-id))))

