(ns com.google.cloud.pubsub.v1.stub.PublisherStub
  "Base stub class for Google Cloud Pub/Sub API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1.stub PublisherStub]))

(defn ->publisher-stub
  "Constructor."
  (^PublisherStub []
    (new PublisherStub )))

(defn list-topics-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicsRequest,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.listTopicsPagedCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.getIamPolicyCallable))))

(defn delete-topic-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteTopicRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.deleteTopicCallable))))

(defn list-topic-subscriptions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicSubscriptionsRequest,com.google.pubsub.v1.ListTopicSubscriptionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.listTopicSubscriptionsCallable))))

(defn create-topic-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.Topic,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.createTopicCallable))))

(defn update-topic-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.updateTopicCallable))))

(defn get-topic-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.GetTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.getTopicCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^PublisherStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.testIamPermissionsCallable))))

(defn publish-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.PublishRequest,com.google.pubsub.v1.PublishResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.publishCallable))))

(defn list-topics-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicsRequest,com.google.pubsub.v1.ListTopicsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.listTopicsCallable))))

(defn list-topic-subscriptions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicSubscriptionsRequest,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^PublisherStub this]
    (-> this (.listTopicSubscriptionsPagedCallable))))

