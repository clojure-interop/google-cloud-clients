(ns com.google.cloud.pubsub.v1.stub.GrpcPublisherStub
  "gRPC stub implementation for Google Cloud Pub/Sub API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1.stub GrpcPublisherStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.pubsub.v1.stub.GrpcPublisherStub`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.stub.GrpcPublisherStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcPublisherStub/create client-context callable-factory))
  (^com.google.cloud.pubsub.v1.stub.GrpcPublisherStub [^com.google.cloud.pubsub.v1.stub.PublisherStubSettings settings]
    (GrpcPublisherStub/create settings)))

(defn list-topics-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicsRequest,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.listTopicsPagedCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.getIamPolicyCallable))))

(defn delete-topic-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteTopicRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.deleteTopicCallable))))

(defn list-topic-subscriptions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicSubscriptionsRequest,com.google.pubsub.v1.ListTopicSubscriptionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.listTopicSubscriptionsCallable))))

(defn create-topic-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.Topic,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.createTopicCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcPublisherStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcPublisherStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcPublisherStub this]
    (-> this (.shutdown))))

(defn update-topic-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.updateTopicCallable))))

(defn get-topic-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.GetTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.getTopicCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^GrpcPublisherStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.testIamPermissionsCallable))))

(defn publish-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.PublishRequest,com.google.pubsub.v1.PublishResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.publishCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcPublisherStub this]
    (-> this (.isTerminated))))

(defn list-topics-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicsRequest,com.google.pubsub.v1.ListTopicsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.listTopicsCallable))))

(defn list-topic-subscriptions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicSubscriptionsRequest,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcPublisherStub this]
    (-> this (.listTopicSubscriptionsPagedCallable))))

(defn shutdown-now
  ""
  ([^GrpcPublisherStub this]
    (-> this (.shutdownNow))))

