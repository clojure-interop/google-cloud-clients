# Bindings for com.google.cloud.pubsub

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.pubsub "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- interface **com.google.cloud.pubsub.v1.AckReplyConsumer**
- interface **com.google.cloud.pubsub.v1.MessageReceiver**
- class **com.google.cloud.pubsub.v1.OpenCensusUtil$OpenCensusMessageReceiver**
- class **com.google.cloud.pubsub.v1.OpenCensusUtil**
- class **com.google.cloud.pubsub.v1.Publisher$Builder**
- class **com.google.cloud.pubsub.v1.Publisher**
- class **com.google.cloud.pubsub.v1.Subscriber$Builder**
- class **com.google.cloud.pubsub.v1.Subscriber**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsFixedSizeCollection**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPage**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsFixedSizeCollection**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPage**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminClient**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder**
- class **com.google.cloud.pubsub.v1.SubscriptionAdminSettings**
- class **com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsFixedSizeCollection**
- class **com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPage**
- class **com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse**
- class **com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsFixedSizeCollection**
- class **com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPage**
- class **com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse**
- class **com.google.cloud.pubsub.v1.TopicAdminClient**
- class **com.google.cloud.pubsub.v1.TopicAdminSettings$Builder**
- class **com.google.cloud.pubsub.v1.TopicAdminSettings**
- class **com.google.cloud.pubsub.v1.stub.GrpcPublisherCallableFactory**
- class **com.google.cloud.pubsub.v1.stub.GrpcPublisherStub**
- class **com.google.cloud.pubsub.v1.stub.GrpcSubscriberCallableFactory**
- class **com.google.cloud.pubsub.v1.stub.GrpcSubscriberStub**
- class **com.google.cloud.pubsub.v1.stub.PublisherStub**
- class **com.google.cloud.pubsub.v1.stub.PublisherStubSettings$Builder**
- class **com.google.cloud.pubsub.v1.stub.PublisherStubSettings**
- class **com.google.cloud.pubsub.v1.stub.SubscriberStub**
- class **com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder**
- class **com.google.cloud.pubsub.v1.stub.SubscriberStubSettings**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
