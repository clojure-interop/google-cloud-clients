(ns com.google.cloud.pubsub.v1.stub.PublisherStubSettings
  "Settings class to configure an instance of PublisherStub.

  The default instance has everything set to sensible defaults:


    The default service address (pubsub.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createTopic to 30 seconds:



  PublisherStubSettings.Builder topicAdminSettingsBuilder =
      PublisherStubSettings.newBuilder();
  topicAdminSettingsBuilder.createTopicSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  PublisherStubSettings topicAdminSettings = topicAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1.stub PublisherStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (PublisherStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (PublisherStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (PublisherStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (PublisherStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (PublisherStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (PublisherStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (PublisherStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.pubsub.v1.stub.PublisherStubSettings$Builder`"
  (^com.google.cloud.pubsub.v1.stub.PublisherStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (PublisherStubSettings/newBuilder client-context))
  (^com.google.cloud.pubsub.v1.stub.PublisherStubSettings$Builder []
    (PublisherStubSettings/newBuilder )))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.pubsub.v1.stub.PublisherStub`

  throws: java.io.IOException"
  ([^PublisherStubSettings this]
    (-> this (.createStub))))

(defn publish-settings
  "Returns the object with the settings used for calls to publish.

  returns: `com.google.api.gax.rpc.BatchingCallSettings<com.google.pubsub.v1.PublishRequest,com.google.pubsub.v1.PublishResponse>`"
  (^com.google.api.gax.rpc.BatchingCallSettings [^PublisherStubSettings this]
    (-> this (.publishSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PublisherStubSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn list-topic-subscriptions-settings
  "Returns the object with the settings used for calls to listTopicSubscriptions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.pubsub.v1.ListTopicSubscriptionsRequest,com.google.pubsub.v1.ListTopicSubscriptionsResponse,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^PublisherStubSettings this]
    (-> this (.listTopicSubscriptionsSettings))))

(defn list-topics-settings
  "Returns the object with the settings used for calls to listTopics.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.pubsub.v1.ListTopicsRequest,com.google.pubsub.v1.ListTopicsResponse,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^PublisherStubSettings this]
    (-> this (.listTopicsSettings))))

(defn get-topic-settings
  "Returns the object with the settings used for calls to getTopic.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.GetTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PublisherStubSettings this]
    (-> this (.getTopicSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PublisherStubSettings this]
    (-> this (.setIamPolicySettings))))

(defn delete-topic-settings
  "Returns the object with the settings used for calls to deleteTopic.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.DeleteTopicRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PublisherStubSettings this]
    (-> this (.deleteTopicSettings))))

(defn create-topic-settings
  "Returns the object with the settings used for calls to createTopic.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.Topic,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PublisherStubSettings this]
    (-> this (.createTopicSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PublisherStubSettings this]
    (-> this (.getIamPolicySettings))))

(defn update-topic-settings
  "Returns the object with the settings used for calls to updateTopic.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.UpdateTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^PublisherStubSettings this]
    (-> this (.updateTopicSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.pubsub.v1.stub.PublisherStubSettings$Builder`"
  (^com.google.cloud.pubsub.v1.stub.PublisherStubSettings$Builder [^PublisherStubSettings this]
    (-> this (.toBuilder))))

