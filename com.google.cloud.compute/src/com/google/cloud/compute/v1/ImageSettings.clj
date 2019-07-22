(ns com.google.cloud.compute.v1.ImageSettings
  "Settings class to configure an instance of ImageClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteImage to 30 seconds:



  ImageSettings.Builder imageSettingsBuilder =
      ImageSettings.newBuilder();
  imageSettingsBuilder.deleteImageSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ImageSettings imageSettings = imageSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ImageSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (ImageSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ImageSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ImageSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ImageSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.ImageSettings$Builder`"
  (^com.google.cloud.compute.v1.ImageSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ImageSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.ImageSettings$Builder []
    (ImageSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ImageSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (ImageSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.ImageStubSettings`

  returns: `com.google.cloud.compute.v1.ImageSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ImageSettings [^com.google.cloud.compute.v1.stub.ImageStubSettings stub]
    (ImageSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ImageSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ImageSettings/getDefaultServiceScopes )))

(defn set-labels-image-settings
  "Returns the object with the settings used for calls to setLabelsImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetLabelsImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.setLabelsImageSettings))))

(defn get-image-settings
  "Returns the object with the settings used for calls to getImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.getImageSettings))))

(defn test-iam-permissions-image-settings
  "Returns the object with the settings used for calls to testIamPermissionsImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsImageHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.testIamPermissionsImageSettings))))

(defn deprecate-image-settings
  "Returns the object with the settings used for calls to deprecateImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeprecateImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.deprecateImageSettings))))

(defn get-from-family-image-settings
  "Returns the object with the settings used for calls to getFromFamilyImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetFromFamilyImageHttpRequest,com.google.cloud.compute.v1.Image>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.getFromFamilyImageSettings))))

(defn insert-image-settings
  "Returns the object with the settings used for calls to insertImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.insertImageSettings))))

(defn get-iam-policy-image-settings
  "Returns the object with the settings used for calls to getIamPolicyImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.getIamPolicyImageSettings))))

(defn delete-image-settings
  "Returns the object with the settings used for calls to deleteImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteImageHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.deleteImageSettings))))

(defn set-iam-policy-image-settings
  "Returns the object with the settings used for calls to setIamPolicyImage.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyImageHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ImageSettings this]
    (-> this (.setIamPolicyImageSettings))))

(defn list-images-settings
  "Returns the object with the settings used for calls to listImages.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListImagesHttpRequest,com.google.cloud.compute.v1.ImageList,com.google.cloud.compute.v1.ImageClient$ListImagesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ImageSettings this]
    (-> this (.listImagesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.ImageSettings$Builder`"
  (^com.google.cloud.compute.v1.ImageSettings$Builder [^ImageSettings this]
    (-> this (.toBuilder))))

