(ns com.google.cloud.bigtable.admin.v2.models.AppProfile
  "An application profile, or app profile, stores settings that tell your Cloud Bigtable instance
  how to handle incoming requests from an application. When one of your applications connects to a
  Cloud Bigtable instance, it can specify an app profile, and Cloud Bigtable uses that app profile
  for any requests that the application sends over that connection.

  App profiles affect how your applications communicate with an instance that uses replication.
  As a result, app profiles are especially useful for instances that have 2 clusters. Even if your
  instance has only 1 cluster, you can use a unique app profile for each application that you run,
  or for different components within a single application."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models AppProfile]))

(defn *from-proto
  "Wraps a protobuf response.

   This method is considered an internal implementation detail and not meant to be used by
   applications.

  proto - `com.google.bigtable.admin.v2.AppProfile`

  returns: `com.google.cloud.bigtable.admin.v2.models.AppProfile`"
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile [^com.google.bigtable.admin.v2.AppProfile proto]
    (AppProfile/fromProto proto)))

(defn get-policy
  "Gets the routing policy for all read/write requests which use this app profile.

  returns: `com.google.cloud.bigtable.admin.v2.models.AppProfile$RoutingPolicy`"
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile$RoutingPolicy [^AppProfile this]
    (-> this (.getPolicy))))

(defn get-id
  "Gets the id of this AppProfile.

  returns: `java.lang.String`"
  (^java.lang.String [^AppProfile this]
    (-> this (.getId))))

(defn get-instance-id
  "Gets the id of the instance that owns this AppProfile.

  returns: `java.lang.String`"
  (^java.lang.String [^AppProfile this]
    (-> this (.getInstanceId))))

(defn get-description
  "Gets long form description of the use case for this AppProfile.

  returns: `java.lang.String`"
  (^java.lang.String [^AppProfile this]
    (-> this (.getDescription))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AppProfile this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AppProfile this]
    (-> this (.hashCode))))

