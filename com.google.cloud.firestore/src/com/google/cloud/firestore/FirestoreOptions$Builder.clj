(ns com.google.cloud.firestore.FirestoreOptions$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.firestore FirestoreOptions$Builder]))

(defn set-transport-options
  "Sets the TransportOptions to use with this Firestore client.

  transport-options - A GrpcTransportOptions object that defines the transport options for this client. - `com.google.cloud.TransportOptions`

  returns: the builder - `com.google.cloud.firestore.FirestoreOptions$Builder`"
  (^com.google.cloud.firestore.FirestoreOptions$Builder [^FirestoreOptions$Builder this ^com.google.cloud.TransportOptions transport-options]
    (-> this (.setTransportOptions transport-options))))

(defn set-channel-provider
  "Sets the TransportChannelProvider to use with this Firestore client.

  channel-provider - A InstantiatingGrpcChannelProvider object that defines the transport provider for this client. - `com.google.api.gax.rpc.TransportChannelProvider`

  returns: `com.google.cloud.firestore.FirestoreOptions$Builder`"
  (^com.google.cloud.firestore.FirestoreOptions$Builder [^FirestoreOptions$Builder this ^com.google.api.gax.rpc.TransportChannelProvider channel-provider]
    (-> this (.setChannelProvider channel-provider))))

(defn set-credentials-provider
  "Sets the CredentialsProvider to use with this Firestore client.

  credentials-provider - A CredentialsProvider object that defines the credential provider for this client. - `com.google.api.gax.core.CredentialsProvider`

  returns: `com.google.cloud.firestore.FirestoreOptions$Builder`"
  (^com.google.cloud.firestore.FirestoreOptions$Builder [^FirestoreOptions$Builder this ^com.google.api.gax.core.CredentialsProvider credentials-provider]
    (-> this (.setCredentialsProvider credentials-provider))))

(defn set-database-id
  "Sets the database ID to use with this Firestore client.

  database-id - The Firestore database ID to use with this client. - `java.lang.String`

  returns: `com.google.cloud.firestore.FirestoreOptions$Builder`"
  (^com.google.cloud.firestore.FirestoreOptions$Builder [^FirestoreOptions$Builder this ^java.lang.String database-id]
    (-> this (.setDatabaseId database-id))))

(defn set-timestamps-in-snapshots-enabled
  "Deprecated. This setting now defaults to true and will be removed in a future release. If you
       are already setting it to true, just remove the setting. If you are setting it to false,
       you should update your code to expect Timestamps
       instead of Dates and then remove the setting.

  value - `boolean`

  returns: `com.google.cloud.firestore.FirestoreOptions$Builder`"
  (^com.google.cloud.firestore.FirestoreOptions$Builder [^FirestoreOptions$Builder this ^Boolean value]
    (-> this (.setTimestampsInSnapshotsEnabled value))))

(defn build
  "returns: `com.google.cloud.firestore.FirestoreOptions`"
  (^com.google.cloud.firestore.FirestoreOptions [^FirestoreOptions$Builder this]
    (-> this (.build))))

