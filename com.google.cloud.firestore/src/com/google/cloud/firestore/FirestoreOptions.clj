(ns com.google.cloud.firestore.FirestoreOptions
  "A Factory class to create new Firestore instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore FirestoreOptions]))

(defn *get-default-instance
  "Returns a default FirestoreOptions instance.

  returns: `com.google.cloud.firestore.FirestoreOptions`"
  (^com.google.cloud.firestore.FirestoreOptions []
    (FirestoreOptions/getDefaultInstance )))

(defn *get-default-transport-options-builder
  "returns: `com.google.cloud.grpc.GrpcTransportOptions$Builder`"
  (^com.google.cloud.grpc.GrpcTransportOptions$Builder []
    (FirestoreOptions/getDefaultTransportOptionsBuilder )))

(defn *get-default-transport-channel-provider-builder
  "returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (FirestoreOptions/getDefaultTransportChannelProviderBuilder )))

(defn *get-default-credentials-provider-builder
  "returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (FirestoreOptions/getDefaultCredentialsProviderBuilder )))

(defn *new-builder
  "returns: `com.google.cloud.firestore.FirestoreOptions$Builder`"
  (^com.google.cloud.firestore.FirestoreOptions$Builder []
    (FirestoreOptions/newBuilder )))

(defn get-database-id
  "returns: `java.lang.String`"
  (^java.lang.String [^FirestoreOptions this]
    (-> this (.getDatabaseId))))

(defn get-credentials-provider
  "returns: `com.google.api.gax.core.CredentialsProvider`"
  (^com.google.api.gax.core.CredentialsProvider [^FirestoreOptions this]
    (-> this (.getCredentialsProvider))))

(defn get-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider [^FirestoreOptions this]
    (-> this (.getTransportChannelProvider))))

(defn are-timestamps-in-snapshots-enabled
  "Returns whether or not DocumentSnapshots return timestamp fields as
   Timestamps.

  returns: `boolean`"
  (^Boolean [^FirestoreOptions this]
    (-> this (.areTimestampsInSnapshotsEnabled))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FirestoreOptions this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FirestoreOptions this]
    (-> this (.hashCode))))

(defn to-builder
  "returns: `com.google.cloud.firestore.FirestoreOptions$Builder`"
  (^com.google.cloud.firestore.FirestoreOptions$Builder [^FirestoreOptions this]
    (-> this (.toBuilder))))

