(ns com.google.cloud.compute.v1.BackendBucketSettings
  "Settings class to configure an instance of BackendBucketClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addSignedUrlKeyBackendBucket to 30 seconds:



  BackendBucketSettings.Builder backendBucketSettingsBuilder =
      BackendBucketSettings.newBuilder();
  backendBucketSettingsBuilder.addSignedUrlKeyBackendBucketSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  BackendBucketSettings backendBucketSettings = backendBucketSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendBucketSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (BackendBucketSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (BackendBucketSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (BackendBucketSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (BackendBucketSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.BackendBucketSettings$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (BackendBucketSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.BackendBucketSettings$Builder []
    (BackendBucketSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (BackendBucketSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (BackendBucketSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.BackendBucketStubSettings`

  returns: `com.google.cloud.compute.v1.BackendBucketSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.BackendBucketSettings [^com.google.cloud.compute.v1.stub.BackendBucketStubSettings stub]
    (BackendBucketSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (BackendBucketSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (BackendBucketSettings/getDefaultServiceScopes )))

(defn delete-backend-bucket-settings
  "Returns the object with the settings used for calls to deleteBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendBucketSettings this]
    (-> this (.deleteBackendBucketSettings))))

(defn get-backend-bucket-settings
  "Returns the object with the settings used for calls to getBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetBackendBucketHttpRequest,com.google.cloud.compute.v1.BackendBucket>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendBucketSettings this]
    (-> this (.getBackendBucketSettings))))

(defn patch-backend-bucket-settings
  "Returns the object with the settings used for calls to patchBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendBucketSettings this]
    (-> this (.patchBackendBucketSettings))))

(defn add-signed-url-key-backend-bucket-settings
  "Returns the object with the settings used for calls to addSignedUrlKeyBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendBucketSettings this]
    (-> this (.addSignedUrlKeyBackendBucketSettings))))

(defn list-backend-buckets-settings
  "Returns the object with the settings used for calls to listBackendBuckets.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketList,com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^BackendBucketSettings this]
    (-> this (.listBackendBucketsSettings))))

(defn insert-backend-bucket-settings
  "Returns the object with the settings used for calls to insertBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendBucketSettings this]
    (-> this (.insertBackendBucketSettings))))

(defn update-backend-bucket-settings
  "Returns the object with the settings used for calls to updateBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendBucketSettings this]
    (-> this (.updateBackendBucketSettings))))

(defn delete-signed-url-key-backend-bucket-settings
  "Returns the object with the settings used for calls to deleteSignedUrlKeyBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BackendBucketSettings this]
    (-> this (.deleteSignedUrlKeyBackendBucketSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.BackendBucketSettings$Builder`"
  (^com.google.cloud.compute.v1.BackendBucketSettings$Builder [^BackendBucketSettings this]
    (-> this (.toBuilder))))

