(ns com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings
  "Settings class to configure an instance of InstanceTemplateStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteInstanceTemplate to 30 seconds:



  InstanceTemplateStubSettings.Builder instanceTemplateSettingsBuilder =
      InstanceTemplateStubSettings.newBuilder();
  instanceTemplateSettingsBuilder.deleteInstanceTemplateSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InstanceTemplateStubSettings instanceTemplateSettings = instanceTemplateSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceTemplateStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InstanceTemplateStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InstanceTemplateStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InstanceTemplateStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InstanceTemplateStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InstanceTemplateStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings$Builder []
    (InstanceTemplateStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InstanceTemplateStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InstanceTemplateStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InstanceTemplateStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InstanceTemplateStubSettings/getDefaultServiceScopes )))

(defn list-instance-templates-settings
  "Returns the object with the settings used for calls to listInstanceTemplates.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateList,com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceTemplateStubSettings this]
    (-> this (.listInstanceTemplatesSettings))))

(defn insert-instance-template-settings
  "Returns the object with the settings used for calls to insertInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateStubSettings this]
    (-> this (.insertInstanceTemplateSettings))))

(defn test-iam-permissions-instance-template-settings
  "Returns the object with the settings used for calls to testIamPermissionsInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsInstanceTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateStubSettings this]
    (-> this (.testIamPermissionsInstanceTemplateSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InstanceTemplateStub`

  throws: java.io.IOException"
  ([^InstanceTemplateStubSettings this]
    (-> this (.createStub))))

(defn get-iam-policy-instance-template-settings
  "Returns the object with the settings used for calls to getIamPolicyInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateStubSettings this]
    (-> this (.getIamPolicyInstanceTemplateSettings))))

(defn set-iam-policy-instance-template-settings
  "Returns the object with the settings used for calls to setIamPolicyInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateStubSettings this]
    (-> this (.setIamPolicyInstanceTemplateSettings))))

(defn get-instance-template-settings
  "Returns the object with the settings used for calls to getInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInstanceTemplateHttpRequest,com.google.cloud.compute.v1.InstanceTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateStubSettings this]
    (-> this (.getInstanceTemplateSettings))))

(defn delete-instance-template-settings
  "Returns the object with the settings used for calls to deleteInstanceTemplate.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceTemplateStubSettings this]
    (-> this (.deleteInstanceTemplateSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceTemplateStubSettings$Builder [^InstanceTemplateStubSettings this]
    (-> this (.toBuilder))))

