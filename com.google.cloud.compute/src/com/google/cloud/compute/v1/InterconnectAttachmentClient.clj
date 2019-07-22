(ns com.google.cloud.compute.v1.InterconnectAttachmentClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
    ProjectRegionInterconnectAttachmentName interconnectAttachment = ProjectRegionInterconnectAttachmentName.of(\"[PROJECT]\", \"[REGION]\", \"[INTERCONNECT_ATTACHMENT]\");
    Operation response = interconnectAttachmentClient.deleteInterconnectAttachment(interconnectAttachment);
  }

  Note: close() needs to be called on the interconnectAttachmentClient object to clean up
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

  This class can be customized by passing in a custom instance of InterconnectAttachmentSettings
  to create(). For example:

  To customize credentials:



  InterconnectAttachmentSettings interconnectAttachmentSettings =
      InterconnectAttachmentSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  InterconnectAttachmentClient interconnectAttachmentClient =
      InterconnectAttachmentClient.create(interconnectAttachmentSettings);

  To customize the endpoint:



  InterconnectAttachmentSettings interconnectAttachmentSettings =
      InterconnectAttachmentSettings.newBuilder().setEndpoint(myEndpoint).build();
  InterconnectAttachmentClient interconnectAttachmentClient =
      InterconnectAttachmentClient.create(interconnectAttachmentSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectAttachmentClient]))

(defn *create
  "Constructs an instance of InterconnectAttachmentClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.InterconnectAttachmentSettings`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InterconnectAttachmentClient [^com.google.cloud.compute.v1.InterconnectAttachmentSettings settings]
    (InterconnectAttachmentClient/create settings))
  (^com.google.cloud.compute.v1.InterconnectAttachmentClient []
    (InterconnectAttachmentClient/create )))

(defn list-interconnect-attachments-paged-callable
  "Retrieves the list of interconnect attachments contained within the specified region.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListInterconnectAttachmentsHttpRequest request = ListInterconnectAttachmentsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListInterconnectAttachmentsPagedResponse> future = interconnectAttachmentClient.listInterconnectAttachmentsPagedCallable().futureCall(request);
     // Do something
     for (InterconnectAttachment element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentClient$ListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentClient this]
    (-> this (.listInterconnectAttachmentsPagedCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.InterconnectAttachmentSettings`"
  (^com.google.cloud.compute.v1.InterconnectAttachmentSettings [^InterconnectAttachmentClient this]
    (-> this (.getSettings))))

(defn aggregated-list-interconnect-attachments-paged-callable
  "Retrieves an aggregated list of interconnect attachments.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListInterconnectAttachmentsHttpRequest request = AggregatedListInterconnectAttachmentsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListInterconnectAttachmentsPagedResponse> future = interconnectAttachmentClient.aggregatedListInterconnectAttachmentsPagedCallable().futureCall(request);
     // Do something
     for (InterconnectAttachmentsScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentClient$AggregatedListInterconnectAttachmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentClient this]
    (-> this (.aggregatedListInterconnectAttachmentsPagedCallable))))

(defn insert-interconnect-attachment-callable
  "Creates an InterconnectAttachment in the specified project using the data included in the
   request.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     InterconnectAttachment interconnectAttachmentResource = InterconnectAttachment.newBuilder().build();
     InsertInterconnectAttachmentHttpRequest request = InsertInterconnectAttachmentHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setInterconnectAttachmentResource(interconnectAttachmentResource)
       .build();
     ApiFuture<Operation> future = interconnectAttachmentClient.insertInterconnectAttachmentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentClient this]
    (-> this (.insertInterconnectAttachmentCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InterconnectAttachmentStub`"
  ([^InterconnectAttachmentClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^InterconnectAttachmentClient this]
    (-> this (.isShutdown))))

(defn list-interconnect-attachments-callable
  "Retrieves the list of interconnect attachments contained within the specified region.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListInterconnectAttachmentsHttpRequest request = ListInterconnectAttachmentsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       InterconnectAttachmentList response = interconnectAttachmentClient.listInterconnectAttachmentsCallable().call(request);
       for (InterconnectAttachment element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentClient this]
    (-> this (.listInterconnectAttachmentsCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^InterconnectAttachmentClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn aggregated-list-interconnect-attachments-callable
  "Retrieves an aggregated list of interconnect attachments.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListInterconnectAttachmentsHttpRequest request = AggregatedListInterconnectAttachmentsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       InterconnectAttachmentAggregatedList response = interconnectAttachmentClient.aggregatedListInterconnectAttachmentsCallable().call(request);
       for (InterconnectAttachmentsScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInterconnectAttachmentsHttpRequest,com.google.cloud.compute.v1.InterconnectAttachmentAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentClient this]
    (-> this (.aggregatedListInterconnectAttachmentsCallable))))

(defn shutdown
  ""
  ([^InterconnectAttachmentClient this]
    (-> this (.shutdown))))

(defn patch-interconnect-attachment-callable
  "Updates the specified interconnect attachment with the data included in the request. This
   method supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     String formattedInterconnectAttachment = ProjectRegionInterconnectAttachmentName.format(\"[PROJECT]\", \"[REGION]\", \"[INTERCONNECT_ATTACHMENT]\");
     InterconnectAttachment interconnectAttachmentResource = InterconnectAttachment.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchInterconnectAttachmentHttpRequest request = PatchInterconnectAttachmentHttpRequest.newBuilder()
       .setInterconnectAttachment(formattedInterconnectAttachment)
       .setInterconnectAttachmentResource(interconnectAttachmentResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = interconnectAttachmentClient.patchInterconnectAttachmentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentClient this]
    (-> this (.patchInterconnectAttachmentCallable))))

(defn patch-interconnect-attachment
  "Updates the specified interconnect attachment with the data included in the request. This
   method supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     ProjectRegionInterconnectAttachmentName interconnectAttachment = ProjectRegionInterconnectAttachmentName.of(\"[PROJECT]\", \"[REGION]\", \"[INTERCONNECT_ATTACHMENT]\");
     InterconnectAttachment interconnectAttachmentResource = InterconnectAttachment.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = interconnectAttachmentClient.patchInterconnectAttachment(interconnectAttachment, interconnectAttachmentResource, fieldMask);
   }

  interconnect-attachment - Name of the interconnect attachment to patch. - `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName`
  interconnect-attachment-resource - Represents an InterconnectAttachment (VLAN attachment) resource. For more information, see Creating VLAN Attachments. (== resource_for beta.interconnectAttachments ==) (== resource_for v1.interconnectAttachments ==) - `com.google.cloud.compute.v1.InterconnectAttachment`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InterconnectAttachmentClient this ^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName interconnect-attachment ^com.google.cloud.compute.v1.InterconnectAttachment interconnect-attachment-resource ^java.util.List field-mask]
    (-> this (.patchInterconnectAttachment interconnect-attachment interconnect-attachment-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^InterconnectAttachmentClient this ^com.google.cloud.compute.v1.PatchInterconnectAttachmentHttpRequest request]
    (-> this (.patchInterconnectAttachment request))))

(defn delete-interconnect-attachment-callable
  "Deletes the specified interconnect attachment.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     String formattedInterconnectAttachment = ProjectRegionInterconnectAttachmentName.format(\"[PROJECT]\", \"[REGION]\", \"[INTERCONNECT_ATTACHMENT]\");
     DeleteInterconnectAttachmentHttpRequest request = DeleteInterconnectAttachmentHttpRequest.newBuilder()
       .setInterconnectAttachment(formattedInterconnectAttachment)
       .build();
     ApiFuture<Operation> future = interconnectAttachmentClient.deleteInterconnectAttachmentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentClient this]
    (-> this (.deleteInterconnectAttachmentCallable))))

(defn close
  ""
  ([^InterconnectAttachmentClient this]
    (-> this (.close))))

(defn aggregated-list-interconnect-attachments
  "Retrieves an aggregated list of interconnect attachments.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (InterconnectAttachmentsScopedList element : interconnectAttachmentClient.aggregatedListInterconnectAttachments(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentClient$AggregatedListInterconnectAttachmentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InterconnectAttachmentClient$AggregatedListInterconnectAttachmentsPagedResponse [^InterconnectAttachmentClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListInterconnectAttachments project))))

(defn get-interconnect-attachment-callable
  "Returns the specified interconnect attachment.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     String formattedInterconnectAttachment = ProjectRegionInterconnectAttachmentName.format(\"[PROJECT]\", \"[REGION]\", \"[INTERCONNECT_ATTACHMENT]\");
     GetInterconnectAttachmentHttpRequest request = GetInterconnectAttachmentHttpRequest.newBuilder()
       .setInterconnectAttachment(formattedInterconnectAttachment)
       .build();
     ApiFuture<InterconnectAttachment> future = interconnectAttachmentClient.getInterconnectAttachmentCallable().futureCall(request);
     // Do something
     InterconnectAttachment response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectAttachmentHttpRequest,com.google.cloud.compute.v1.InterconnectAttachment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectAttachmentClient this]
    (-> this (.getInterconnectAttachmentCallable))))

(defn get-interconnect-attachment
  "Returns the specified interconnect attachment.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     ProjectRegionInterconnectAttachmentName interconnectAttachment = ProjectRegionInterconnectAttachmentName.of(\"[PROJECT]\", \"[REGION]\", \"[INTERCONNECT_ATTACHMENT]\");
     InterconnectAttachment response = interconnectAttachmentClient.getInterconnectAttachment(interconnectAttachment);
   }

  interconnect-attachment - Name of the interconnect attachment to return. - `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName`

  returns: `com.google.cloud.compute.v1.InterconnectAttachment`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InterconnectAttachment [^InterconnectAttachmentClient this ^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName interconnect-attachment]
    (-> this (.getInterconnectAttachment interconnect-attachment))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^InterconnectAttachmentClient this]
    (-> this (.isTerminated))))

(defn list-interconnect-attachments
  "Retrieves the list of interconnect attachments contained within the specified region.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (InterconnectAttachment element : interconnectAttachmentClient.listInterconnectAttachments(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.InterconnectAttachmentClient$ListInterconnectAttachmentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InterconnectAttachmentClient$ListInterconnectAttachmentsPagedResponse [^InterconnectAttachmentClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listInterconnectAttachments region))))

(defn insert-interconnect-attachment
  "Creates an InterconnectAttachment in the specified project using the data included in the
   request.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     InterconnectAttachment interconnectAttachmentResource = InterconnectAttachment.newBuilder().build();
     Operation response = interconnectAttachmentClient.insertInterconnectAttachment(region, interconnectAttachmentResource);
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  interconnect-attachment-resource - Represents an InterconnectAttachment (VLAN attachment) resource. For more information, see Creating VLAN Attachments. (== resource_for beta.interconnectAttachments ==) (== resource_for v1.interconnectAttachments ==) - `com.google.cloud.compute.v1.InterconnectAttachment`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InterconnectAttachmentClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.InterconnectAttachment interconnect-attachment-resource]
    (-> this (.insertInterconnectAttachment region interconnect-attachment-resource)))
  (^com.google.cloud.compute.v1.Operation [^InterconnectAttachmentClient this ^com.google.cloud.compute.v1.InsertInterconnectAttachmentHttpRequest request]
    (-> this (.insertInterconnectAttachment request))))

(defn delete-interconnect-attachment
  "Deletes the specified interconnect attachment.

   Sample code:



   try (InterconnectAttachmentClient interconnectAttachmentClient = InterconnectAttachmentClient.create()) {
     ProjectRegionInterconnectAttachmentName interconnectAttachment = ProjectRegionInterconnectAttachmentName.of(\"[PROJECT]\", \"[REGION]\", \"[INTERCONNECT_ATTACHMENT]\");
     Operation response = interconnectAttachmentClient.deleteInterconnectAttachment(interconnectAttachment);
   }

  interconnect-attachment - Name of the interconnect attachment to delete. - `com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InterconnectAttachmentClient this ^com.google.cloud.compute.v1.ProjectRegionInterconnectAttachmentName interconnect-attachment]
    (-> this (.deleteInterconnectAttachment interconnect-attachment))))

(defn shutdown-now
  ""
  ([^InterconnectAttachmentClient this]
    (-> this (.shutdownNow))))

