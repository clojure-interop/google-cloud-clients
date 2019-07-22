(ns com.google.cloud.compute.v1.InstanceTemplateSettings
  "Settings class to configure an instance of InstanceTemplateClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteInstanceTemplate to 30 seconds:



  InstanceTemplateSettings.Builder instanceTemplateSettingsBuilder =
      InstanceTemplateSettings.newBuilder();
  instanceTemplateSettingsBuilder.deleteInstanceTemplateSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InstanceTemplateSettings instanceTemplateSettings = instanceTemplateSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceTemplateSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InstanceTemplateSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InstanceTemplateSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InstanceTemplateSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InstanceTemplateSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.InstanceTemplateSettings$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplateSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InstanceTemplateSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.InstanceTemplateSettings$Builder []
    (InstanceTemplateSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InstanceTemplateSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InstanceTemplateSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings`

  returns: `com.google.cloud.compute.v1.InstanceTemplateSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InstanceTemplateSettings [^com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings stub]
    (InstanceTemplateSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InstanceTemplateSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InstanceTemplateSettings/getDefaultServiceScopes )))

(defn delete-instance-template-settings
  "Returns the object with the settings used for calls to deleteInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateSettings this]
    (-> this (.deleteInstanceTemplateSettings))))

(defn get-instance-template-settings
  "Returns the object with the settings used for calls to getInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInstanceTemplateHttpRequest,com.google.cloud.compute.v1.InstanceTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateSettings this]
    (-> this (.getInstanceTemplateSettings))))

(defn get-iam-policy-instance-template-settings
  "Returns the object with the settings used for calls to getIamPolicyInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateSettings this]
    (-> this (.getIamPolicyInstanceTemplateSettings))))

(defn insert-instance-template-settings
  "Returns the object with the settings used for calls to insertInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateSettings this]
    (-> this (.insertInstanceTemplateSettings))))

(defn list-instance-templates-settings
  "Returns the object with the settings used for calls to listInstanceTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateList,com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceTemplateSettings this]
    (-> this (.listInstanceTemplatesSettings))))

(defn set-iam-policy-instance-template-settings
  "Returns the object with the settings used for calls to setIamPolicyInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateSettings this]
    (-> this (.setIamPolicyInstanceTemplateSettings))))

(defn test-iam-permissions-instance-template-settings
  "Returns the object with the settings used for calls to testIamPermissionsInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsInstanceTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateSettings this]
    (-> this (.testIamPermissionsInstanceTemplateSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.InstanceTemplateSettings$Builder`"
  (^com.google.cloud.compute.v1.InstanceTemplateSettings$Builder [^InstanceTemplateSettings this]
    (-> this (.toBuilder))))

