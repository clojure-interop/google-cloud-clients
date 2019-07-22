(ns com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings
  "Settings class to configure an instance of InterconnectAttachmentStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteInterconnectAttachment to 30 seconds:



  InterconnectAttachmentStubSettings.Builder interconnectAttachmentSettingsBuilder =
      InterconnectAttachmentStubSettings.newBuilder();
  interconnectAttachmentSettingsBuilder.deleteInterconnectAttachmentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InterconnectAttachmentStubSettings interconnectAttachmentSettings = interconnectAttachmentSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InterconnectAttachmentStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InterconnectAttachmentStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InterconnectAttachmentStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InterconnectAttachmentStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InterconnectAttachmentStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InterconnectAttachmentStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings$Builder []
    (InterconnectAttachmentStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InterconnectAttachmentStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InterconnectAttachmentStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InterconnectAttachmentStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InterconnectAttachmentStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-interconnect-attachments-settings
  "Returns the object with the settings used for calls to aggregatedListInterconnectAttachments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentAggregatedList,com.google.cloud.compute.v1.InterconnectAttachmentClient$AggregatedListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InterconnectAttachmentStubSettings this]
    (-> this (.aggregatedListInterconnectAttachmentsSettings))))

(defn delete-interconnect-attachment-settings
  "Returns the object with the settings used for calls to deleteInterconnectAttachment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectAttachmentStubSettings this]
    (-> this (.deleteInterconnectAttachmentSettings))))

(defn get-interconnect-attachment-settings
  "Returns the object with the settings used for calls to getInterconnectAttachment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.InterconnectAttachment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectAttachmentStubSettings this]
    (-> this (.getInterconnectAttachmentSettings))))

(defn insert-interconnect-attachment-settings
  "Returns the object with the settings used for calls to insertInterconnectAttachment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectAttachmentStubSettings this]
    (-> this (.insertInterconnectAttachmentSettings))))

(defn list-interconnect-attachments-settings
  "Returns the object with the settings used for calls to listInterconnectAttachments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentList,com.google.cloud.compute.v1.InterconnectAttachmentClient$ListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InterconnectAttachmentStubSettings this]
    (-> this (.listInterconnectAttachmentsSettings))))

(defn patch-interconnect-attachment-settings
  "Returns the object with the settings used for calls to patchInterconnectAttachment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InterconnectAttachmentStubSettings this]
    (-> this (.patchInterconnectAttachmentSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InterconnectAttachmentStub`

  throws: java.io.IOException"
  ([^InterconnectAttachmentStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InterconnectAttachmentStubSettings$Builder [^InterconnectAttachmentStubSettings this]
    (-> this (.toBuilder))))

