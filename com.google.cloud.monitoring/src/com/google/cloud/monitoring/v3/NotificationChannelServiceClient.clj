(ns com.google.cloud.monitoring.v3.NotificationChannelServiceClient
  "Service Description: The Notification Channel API provides access to configuration that controls
  how messages related to incidents are sent.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
    NotificationChannelDescriptorName name = NotificationChannelDescriptorName.of(\"[PROJECT]\", \"[CHANNEL_DESCRIPTOR]\");
    NotificationChannelDescriptor response = notificationChannelServiceClient.getNotificationChannelDescriptor(name);
  }

  Note: close() needs to be called on the notificationChannelServiceClient object to clean up
  resources such as threads. In the example above, try-with-resources is used, which automatically
  calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of
  NotificationChannelServiceSettings to create(). For example:

  To customize credentials:



  NotificationChannelServiceSettings notificationChannelServiceSettings =
      NotificationChannelServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  NotificationChannelServiceClient notificationChannelServiceClient =
      NotificationChannelServiceClient.create(notificationChannelServiceSettings);

  To customize the endpoint:



  NotificationChannelServiceSettings notificationChannelServiceSettings =
      NotificationChannelServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  NotificationChannelServiceClient notificationChannelServiceClient =
      NotificationChannelServiceClient.create(notificationChannelServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 NotificationChannelServiceClient]))

(defn *create
  "Constructs an instance of NotificationChannelServiceClient, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.monitoring.v3.NotificationChannelServiceSettings`

  returns: `com.google.cloud.monitoring.v3.NotificationChannelServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.NotificationChannelServiceClient [^com.google.cloud.monitoring.v3.NotificationChannelServiceSettings settings]
    (NotificationChannelServiceClient/create settings))
  (^com.google.cloud.monitoring.v3.NotificationChannelServiceClient []
    (NotificationChannelServiceClient/create )))

(defn list-notification-channel-descriptors-paged-callable
  "Lists the descriptors for supported channel types. The use of descriptors makes it possible for
   new channel types to be dynamically added.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListNotificationChannelDescriptorsRequest request = ListNotificationChannelDescriptorsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListNotificationChannelDescriptorsPagedResponse> future = notificationChannelServiceClient.listNotificationChannelDescriptorsPagedCallable().futureCall(request);
     // Do something
     for (NotificationChannelDescriptor element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.listNotificationChannelDescriptorsPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.monitoring.v3.NotificationChannelServiceSettings`"
  (^com.google.cloud.monitoring.v3.NotificationChannelServiceSettings [^NotificationChannelServiceClient this]
    (-> this (.getSettings))))

(defn list-notification-channels-paged-callable
  "Lists the notification channels that have been created for the project.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListNotificationChannelsRequest request = ListNotificationChannelsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListNotificationChannelsPagedResponse> future = notificationChannelServiceClient.listNotificationChannelsPagedCallable().futureCall(request);
     // Do something
     for (NotificationChannel element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelsRequest,com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.listNotificationChannelsPagedCallable))))

(defn get-notification-channel-descriptor-callable
  "Gets a single channel descriptor. The descriptor indicates which fields are expected /
   permitted for a notification channel of the given type.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     NotificationChannelDescriptorName name = NotificationChannelDescriptorName.of(\"[PROJECT]\", \"[CHANNEL_DESCRIPTOR]\");
     GetNotificationChannelDescriptorRequest request = GetNotificationChannelDescriptorRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<NotificationChannelDescriptor> future = notificationChannelServiceClient.getNotificationChannelDescriptorCallable().futureCall(request);
     // Do something
     NotificationChannelDescriptor response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,com.google.monitoring.v3.NotificationChannelDescriptor>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.getNotificationChannelDescriptorCallable))))

(defn list-notification-channels-callable
  "Lists the notification channels that have been created for the project.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListNotificationChannelsRequest request = ListNotificationChannelsRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListNotificationChannelsResponse response = notificationChannelServiceClient.listNotificationChannelsCallable().call(request);
       for (NotificationChannel element : response.getNotificationChannelsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelsRequest,com.google.monitoring.v3.ListNotificationChannelsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.listNotificationChannelsCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.NotificationChannelServiceStub`"
  ([^NotificationChannelServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^NotificationChannelServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^NotificationChannelServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^NotificationChannelServiceClient this]
    (-> this (.shutdown))))

(defn delete-notification-channel
  "Deletes a notification channel.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     NotificationChannelName name = NotificationChannelName.of(\"[PROJECT]\", \"[NOTIFICATION_CHANNEL]\");
     boolean force = false;
     notificationChannelServiceClient.deleteNotificationChannel(name, force);
   }

  name - The channel for which to execute the request. The format is `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`. - `com.google.monitoring.v3.NotificationChannelName`
  force - If true, the notification channel will be deleted regardless of its use in alert policies (the policies will be updated to remove the channel). If false, channels that are still referenced by an existing alerting policy will fail to be deleted in a delete operation. - `boolean`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^NotificationChannelServiceClient this ^com.google.monitoring.v3.NotificationChannelName name ^Boolean force]
    (-> this (.deleteNotificationChannel name force)))
  ([^NotificationChannelServiceClient this ^com.google.monitoring.v3.DeleteNotificationChannelRequest request]
    (-> this (.deleteNotificationChannel request))))

(defn list-notification-channels
  "Lists the notification channels that have been created for the project.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     for (NotificationChannel element : notificationChannelServiceClient.listNotificationChannels(name).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The project on which to execute the request. The format is `projects/[PROJECT_ID]`. That is, this names the container in which to look for the notification channels; it does not name a specific channel. To query a specific channel by REST resource name, use the [`GetNotificationChannel`][google.monitoring.v3.NotificationChannelService.GetNotificationChannel] operation. - `com.google.monitoring.v3.ProjectName`

  returns: `com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelsPagedResponse [^NotificationChannelServiceClient this ^com.google.monitoring.v3.ProjectName name]
    (-> this (.listNotificationChannels name))))

(defn update-notification-channel
  "Updates a notification channel. Fields not specified in the field mask remain unchanged.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     FieldMask updateMask = FieldMask.newBuilder().build();
     NotificationChannel notificationChannel = NotificationChannel.newBuilder().build();
     NotificationChannel response = notificationChannelServiceClient.updateNotificationChannel(updateMask, notificationChannel);
   }

  update-mask - The fields to update. - `com.google.protobuf.FieldMask`
  notification-channel - A description of the changes to be applied to the specified notification channel. The description must provide a definition for fields to be updated; the names of these fields should also be included in the `update_mask`. - `com.google.monitoring.v3.NotificationChannel`

  returns: `com.google.monitoring.v3.NotificationChannel`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.NotificationChannel [^NotificationChannelServiceClient this ^com.google.protobuf.FieldMask update-mask ^com.google.monitoring.v3.NotificationChannel notification-channel]
    (-> this (.updateNotificationChannel update-mask notification-channel)))
  (^com.google.monitoring.v3.NotificationChannel [^NotificationChannelServiceClient this ^com.google.monitoring.v3.UpdateNotificationChannelRequest request]
    (-> this (.updateNotificationChannel request))))

(defn create-notification-channel
  "Creates a new notification channel, representing a single notification endpoint such as an
   email address, SMS number, or PagerDuty service.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     NotificationChannel notificationChannel = NotificationChannel.newBuilder().build();
     NotificationChannel response = notificationChannelServiceClient.createNotificationChannel(name, notificationChannel);
   }

  name - The project on which to execute the request. The format is: projects/[PROJECT_ID] Note that this names the container into which the channel will be written. This does not name the newly created channel. The resulting channel's name will have a normalized version of this field as a prefix, but will add `/notificationChannels/[CHANNEL_ID]` to identify the channel. - `com.google.monitoring.v3.ProjectName`
  notification-channel - The definition of the `NotificationChannel` to create. - `com.google.monitoring.v3.NotificationChannel`

  returns: `com.google.monitoring.v3.NotificationChannel`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.NotificationChannel [^NotificationChannelServiceClient this ^com.google.monitoring.v3.ProjectName name ^com.google.monitoring.v3.NotificationChannel notification-channel]
    (-> this (.createNotificationChannel name notification-channel)))
  (^com.google.monitoring.v3.NotificationChannel [^NotificationChannelServiceClient this ^com.google.monitoring.v3.CreateNotificationChannelRequest request]
    (-> this (.createNotificationChannel request))))

(defn get-notification-channel-callable
  "Gets a single notification channel. The channel includes the relevant configuration details
   with which the channel was created. However, the response may truncate or omit passwords, API
   keys, or other private key matter and thus the response may not be 100% identical to the
   information that was supplied in the call to the create method.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     NotificationChannelName name = NotificationChannelName.of(\"[PROJECT]\", \"[NOTIFICATION_CHANNEL]\");
     GetNotificationChannelRequest request = GetNotificationChannelRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<NotificationChannel> future = notificationChannelServiceClient.getNotificationChannelCallable().futureCall(request);
     // Do something
     NotificationChannel response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.getNotificationChannelCallable))))

(defn delete-notification-channel-callable
  "Deletes a notification channel.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     NotificationChannelName name = NotificationChannelName.of(\"[PROJECT]\", \"[NOTIFICATION_CHANNEL]\");
     DeleteNotificationChannelRequest request = DeleteNotificationChannelRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = notificationChannelServiceClient.deleteNotificationChannelCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteNotificationChannelRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.deleteNotificationChannelCallable))))

(defn close
  ""
  ([^NotificationChannelServiceClient this]
    (-> this (.close))))

(defn get-notification-channel
  "Gets a single notification channel. The channel includes the relevant configuration details
   with which the channel was created. However, the response may truncate or omit passwords, API
   keys, or other private key matter and thus the response may not be 100% identical to the
   information that was supplied in the call to the create method.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     NotificationChannelName name = NotificationChannelName.of(\"[PROJECT]\", \"[NOTIFICATION_CHANNEL]\");
     NotificationChannel response = notificationChannelServiceClient.getNotificationChannel(name);
   }

  name - The channel for which to execute the request. The format is `projects/[PROJECT_ID]/notificationChannels/[CHANNEL_ID]`. - `com.google.monitoring.v3.NotificationChannelName`

  returns: `com.google.monitoring.v3.NotificationChannel`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.NotificationChannel [^NotificationChannelServiceClient this ^com.google.monitoring.v3.NotificationChannelName name]
    (-> this (.getNotificationChannel name))))

(defn list-notification-channel-descriptors-callable
  "Lists the descriptors for supported channel types. The use of descriptors makes it possible for
   new channel types to be dynamically added.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListNotificationChannelDescriptorsRequest request = ListNotificationChannelDescriptorsRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListNotificationChannelDescriptorsResponse response = notificationChannelServiceClient.listNotificationChannelDescriptorsCallable().call(request);
       for (NotificationChannelDescriptor element : response.getChannelDescriptorsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.listNotificationChannelDescriptorsCallable))))

(defn create-notification-channel-callable
  "Creates a new notification channel, representing a single notification endpoint such as an
   email address, SMS number, or PagerDuty service.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     NotificationChannel notificationChannel = NotificationChannel.newBuilder().build();
     CreateNotificationChannelRequest request = CreateNotificationChannelRequest.newBuilder()
       .setName(name.toString())
       .setNotificationChannel(notificationChannel)
       .build();
     ApiFuture<NotificationChannel> future = notificationChannelServiceClient.createNotificationChannelCallable().futureCall(request);
     // Do something
     NotificationChannel response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.createNotificationChannelCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^NotificationChannelServiceClient this]
    (-> this (.isTerminated))))

(defn list-notification-channel-descriptors
  "Lists the descriptors for supported channel types. The use of descriptors makes it possible for
   new channel types to be dynamically added.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     for (NotificationChannelDescriptor element : notificationChannelServiceClient.listNotificationChannelDescriptors(name).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The REST resource name of the parent from which to retrieve the notification channel descriptors. The expected syntax is: projects/[PROJECT_ID] Note that this names the parent container in which to look for the descriptors; to retrieve a single descriptor by name, use the [GetNotificationChannelDescriptor][google.monitoring.v3.NotificationChannelService.GetNotificationChannelDescriptor] operation, instead. - `com.google.monitoring.v3.ProjectName`

  returns: `com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.NotificationChannelServiceClient$ListNotificationChannelDescriptorsPagedResponse [^NotificationChannelServiceClient this ^com.google.monitoring.v3.ProjectName name]
    (-> this (.listNotificationChannelDescriptors name))))

(defn update-notification-channel-callable
  "Updates a notification channel. Fields not specified in the field mask remain unchanged.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     NotificationChannel notificationChannel = NotificationChannel.newBuilder().build();
     UpdateNotificationChannelRequest request = UpdateNotificationChannelRequest.newBuilder()
       .setNotificationChannel(notificationChannel)
       .build();
     ApiFuture<NotificationChannel> future = notificationChannelServiceClient.updateNotificationChannelCallable().futureCall(request);
     // Do something
     NotificationChannel response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateNotificationChannelRequest,com.google.monitoring.v3.NotificationChannel>`"
  (^com.google.api.gax.rpc.UnaryCallable [^NotificationChannelServiceClient this]
    (-> this (.updateNotificationChannelCallable))))

(defn get-notification-channel-descriptor
  "Gets a single channel descriptor. The descriptor indicates which fields are expected /
   permitted for a notification channel of the given type.

   Sample code:



   try (NotificationChannelServiceClient notificationChannelServiceClient = NotificationChannelServiceClient.create()) {
     NotificationChannelDescriptorName name = NotificationChannelDescriptorName.of(\"[PROJECT]\", \"[CHANNEL_DESCRIPTOR]\");
     NotificationChannelDescriptor response = notificationChannelServiceClient.getNotificationChannelDescriptor(name);
   }

  name - The channel type for which to execute the request. The format is `projects/[PROJECT_ID]/notificationChannelDescriptors/{channel_type}`. - `com.google.monitoring.v3.NotificationChannelDescriptorName`

  returns: `com.google.monitoring.v3.NotificationChannelDescriptor`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.NotificationChannelDescriptor [^NotificationChannelServiceClient this ^com.google.monitoring.v3.NotificationChannelDescriptorName name]
    (-> this (.getNotificationChannelDescriptor name))))

(defn shutdown-now
  ""
  ([^NotificationChannelServiceClient this]
    (-> this (.shutdownNow))))

