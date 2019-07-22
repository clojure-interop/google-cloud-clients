(ns com.google.cloud.compute.v1.stub.BackendBucketStubSettings$Builder
  "Builder for BackendBucketStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub BackendBucketStubSettings$Builder]))

(defn delete-backend-bucket-settings
  "Returns the builder for the settings used for calls to deleteBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendBucketStubSettings$Builder this]
    (-> this (.deleteBackendBucketSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.stub.BackendBucketStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.stub.BackendBucketStubSettings$Builder [^BackendBucketStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn get-backend-bucket-settings
  "Returns the builder for the settings used for calls to getBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetBackendBucketHttpRequest,com.google.cloud.compute.v1.BackendBucket>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendBucketStubSettings$Builder this]
    (-> this (.getBackendBucketSettings))))

(defn patch-backend-bucket-settings
  "Returns the builder for the settings used for calls to patchBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendBucketStubSettings$Builder this]
    (-> this (.patchBackendBucketSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.stub.BackendBucketStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.BackendBucketStubSettings [^BackendBucketStubSettings$Builder this]
    (-> this (.build))))

(defn add-signed-url-key-backend-bucket-settings
  "Returns the builder for the settings used for calls to addSignedUrlKeyBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.AddSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendBucketStubSettings$Builder this]
    (-> this (.addSignedUrlKeyBackendBucketSettings))))

(defn list-backend-buckets-settings
  "Returns the builder for the settings used for calls to listBackendBuckets.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListBackendBucketsHttpRequest,com.google.cloud.compute.v1.BackendBucketList,com.google.cloud.compute.v1.BackendBucketClient$ListBackendBucketsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^BackendBucketStubSettings$Builder this]
    (-> this (.listBackendBucketsSettings))))

(defn insert-backend-bucket-settings
  "Returns the builder for the settings used for calls to insertBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendBucketStubSettings$Builder this]
    (-> this (.insertBackendBucketSettings))))

(defn update-backend-bucket-settings
  "Returns the builder for the settings used for calls to updateBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.UpdateBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendBucketStubSettings$Builder this]
    (-> this (.updateBackendBucketSettings))))

(defn delete-signed-url-key-backend-bucket-settings
  "Returns the builder for the settings used for calls to deleteSignedUrlKeyBackendBucket.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSignedUrlKeyBackendBucketHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^BackendBucketStubSettings$Builder this]
    (-> this (.deleteSignedUrlKeyBackendBucketSettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^BackendBucketStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

