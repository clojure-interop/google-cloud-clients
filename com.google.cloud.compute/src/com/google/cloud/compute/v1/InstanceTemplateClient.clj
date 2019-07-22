(ns com.google.cloud.compute.v1.InstanceTemplateClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
    ProjectGlobalInstanceTemplateName instanceTemplate = ProjectGlobalInstanceTemplateName.of(\"[PROJECT]\", \"[INSTANCE_TEMPLATE]\");
    Operation response = instanceTemplateClient.deleteInstanceTemplate(instanceTemplate);
  }

  Note: close() needs to be called on the instanceTemplateClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

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

  This class can be customized by passing in a custom instance of InstanceTemplateSettings to
  create(). For example:

  To customize credentials:



  InstanceTemplateSettings instanceTemplateSettings =
      InstanceTemplateSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  InstanceTemplateClient instanceTemplateClient =
      InstanceTemplateClient.create(instanceTemplateSettings);

  To customize the endpoint:



  InstanceTemplateSettings instanceTemplateSettings =
      InstanceTemplateSettings.newBuilder().setEndpoint(myEndpoint).build();
  InstanceTemplateClient instanceTemplateClient =
      InstanceTemplateClient.create(instanceTemplateSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceTemplateClient]))

(defn *create
  "Constructs an instance of InstanceTemplateClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.InstanceTemplateSettings`

  returns: `com.google.cloud.compute.v1.InstanceTemplateClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InstanceTemplateClient [^com.google.cloud.compute.v1.InstanceTemplateSettings settings]
    (InstanceTemplateClient/create settings))
  (^com.google.cloud.compute.v1.InstanceTemplateClient []
    (InstanceTemplateClient/create )))

(defn set-iam-policy-instance-template
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     ProjectGlobalInstanceTemplateResourceName resource = ProjectGlobalInstanceTemplateResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
     Policy response = instanceTemplateClient.setIamPolicyInstanceTemplate(resource, globalSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName`
  global-set-policy-request-resource - `com.google.cloud.compute.v1.GlobalSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^InstanceTemplateClient this ^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName resource ^com.google.cloud.compute.v1.GlobalSetPolicyRequest global-set-policy-request-resource]
    (-> this (.setIamPolicyInstanceTemplate resource global-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^InstanceTemplateClient this ^com.google.cloud.compute.v1.SetIamPolicyInstanceTemplateHttpRequest request]
    (-> this (.setIamPolicyInstanceTemplate request))))

(defn get-iam-policy-instance-template-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     String formattedResource = ProjectGlobalInstanceTemplateResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GetIamPolicyInstanceTemplateHttpRequest request = GetIamPolicyInstanceTemplateHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = instanceTemplateClient.getIamPolicyInstanceTemplateCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateClient this]
    (-> this (.getIamPolicyInstanceTemplateCallable))))

(defn get-instance-template-callable
  "Returns the specified instance template. Gets a list of available instance templates by making
   a list() request.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     String formattedInstanceTemplate = ProjectGlobalInstanceTemplateName.format(\"[PROJECT]\", \"[INSTANCE_TEMPLATE]\");
     GetInstanceTemplateHttpRequest request = GetInstanceTemplateHttpRequest.newBuilder()
       .setInstanceTemplate(formattedInstanceTemplate)
       .build();
     ApiFuture<InstanceTemplate> future = instanceTemplateClient.getInstanceTemplateCallable().futureCall(request);
     // Do something
     InstanceTemplate response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceTemplateHttpRequest,com.google.cloud.compute.v1.InstanceTemplate>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateClient this]
    (-> this (.getInstanceTemplateCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.InstanceTemplateSettings`"
  (^com.google.cloud.compute.v1.InstanceTemplateSettings [^InstanceTemplateClient this]
    (-> this (.getSettings))))

(defn delete-instance-template-callable
  "Deletes the specified instance template. Deleting an instance template is permanent and cannot
   be undone. It is not possible to delete templates that are already in use by a managed instance
   group.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     String formattedInstanceTemplate = ProjectGlobalInstanceTemplateName.format(\"[PROJECT]\", \"[INSTANCE_TEMPLATE]\");
     DeleteInstanceTemplateHttpRequest request = DeleteInstanceTemplateHttpRequest.newBuilder()
       .setInstanceTemplate(formattedInstanceTemplate)
       .build();
     ApiFuture<Operation> future = instanceTemplateClient.deleteInstanceTemplateCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateClient this]
    (-> this (.deleteInstanceTemplateCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InstanceTemplateStub`"
  ([^InstanceTemplateClient this]
    (-> this (.getStub))))

(defn get-instance-template
  "Returns the specified instance template. Gets a list of available instance templates by making
   a list() request.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     ProjectGlobalInstanceTemplateName instanceTemplate = ProjectGlobalInstanceTemplateName.of(\"[PROJECT]\", \"[INSTANCE_TEMPLATE]\");
     InstanceTemplate response = instanceTemplateClient.getInstanceTemplate(instanceTemplate);
   }

  instance-template - The name of the instance template. - `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName`

  returns: `com.google.cloud.compute.v1.InstanceTemplate`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceTemplate [^InstanceTemplateClient this ^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName instance-template]
    (-> this (.getInstanceTemplate instance-template))))

(defn insert-instance-template
  "Creates an instance template in the specified project using the data that is included in the
   request. If you are creating a new template to update an existing instance group, your new
   instance template must use the same network or, if applicable, the same subnetwork as the
   original template.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     InstanceTemplate instanceTemplateResource = InstanceTemplate.newBuilder().build();
     Operation response = instanceTemplateClient.insertInstanceTemplate(project, instanceTemplateResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  instance-template-resource - An Instance Template resource. (== resource_for beta.instanceTemplates ==) (== resource_for v1.instanceTemplates ==) - `com.google.cloud.compute.v1.InstanceTemplate`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceTemplateClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.InstanceTemplate instance-template-resource]
    (-> this (.insertInstanceTemplate project instance-template-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceTemplateClient this ^com.google.cloud.compute.v1.InsertInstanceTemplateHttpRequest request]
    (-> this (.insertInstanceTemplate request))))

(defn list-instance-templates-paged-callable
  "Retrieves a list of instance templates that are contained within the specified project.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListInstanceTemplatesHttpRequest request = ListInstanceTemplatesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListInstanceTemplatesPagedResponse> future = instanceTemplateClient.listInstanceTemplatesPagedCallable().futureCall(request);
     // Do something
     for (InstanceTemplate element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateClient this]
    (-> this (.listInstanceTemplatesPagedCallable))))

(defn test-iam-permissions-instance-template-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     String formattedResource = ProjectGlobalInstanceTemplateResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsInstanceTemplateHttpRequest request = TestIamPermissionsInstanceTemplateHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = instanceTemplateClient.testIamPermissionsInstanceTemplateCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsInstanceTemplateHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateClient this]
    (-> this (.testIamPermissionsInstanceTemplateCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^InstanceTemplateClient this]
    (-> this (.isShutdown))))

(defn list-instance-templates
  "Retrieves a list of instance templates that are contained within the specified project.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (InstanceTemplate element : instanceTemplateClient.listInstanceTemplates(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceTemplateClient$ListInstanceTemplatesPagedResponse [^InstanceTemplateClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listInstanceTemplates project))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^InstanceTemplateClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^InstanceTemplateClient this]
    (-> this (.shutdown))))

(defn delete-instance-template
  "Deletes the specified instance template. Deleting an instance template is permanent and cannot
   be undone. It is not possible to delete templates that are already in use by a managed instance
   group.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     ProjectGlobalInstanceTemplateName instanceTemplate = ProjectGlobalInstanceTemplateName.of(\"[PROJECT]\", \"[INSTANCE_TEMPLATE]\");
     Operation response = instanceTemplateClient.deleteInstanceTemplate(instanceTemplate);
   }

  instance-template - The name of the instance template to delete. - `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceTemplateClient this ^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName instance-template]
    (-> this (.deleteInstanceTemplate instance-template))))

(defn get-iam-policy-instance-template
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     ProjectGlobalInstanceTemplateResourceName resource = ProjectGlobalInstanceTemplateResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     Policy response = instanceTemplateClient.getIamPolicyInstanceTemplate(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^InstanceTemplateClient this ^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName resource]
    (-> this (.getIamPolicyInstanceTemplate resource))))

(defn close
  ""
  ([^InstanceTemplateClient this]
    (-> this (.close))))

(defn set-iam-policy-instance-template-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     String formattedResource = ProjectGlobalInstanceTemplateResourceName.format(\"[PROJECT]\", \"[RESOURCE]\");
     GlobalSetPolicyRequest globalSetPolicyRequestResource = GlobalSetPolicyRequest.newBuilder().build();
     SetIamPolicyInstanceTemplateHttpRequest request = SetIamPolicyInstanceTemplateHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setGlobalSetPolicyRequestResource(globalSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = instanceTemplateClient.setIamPolicyInstanceTemplateCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateClient this]
    (-> this (.setIamPolicyInstanceTemplateCallable))))

(defn list-instance-templates-callable
  "Retrieves a list of instance templates that are contained within the specified project.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListInstanceTemplatesHttpRequest request = ListInstanceTemplatesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       InstanceTemplateList response = instanceTemplateClient.listInstanceTemplatesCallable().call(request);
       for (InstanceTemplate element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceTemplatesHttpRequest,com.google.cloud.compute.v1.InstanceTemplateList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateClient this]
    (-> this (.listInstanceTemplatesCallable))))

(defn test-iam-permissions-instance-template
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     ProjectGlobalInstanceTemplateResourceName resource = ProjectGlobalInstanceTemplateResourceName.of(\"[PROJECT]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = instanceTemplateClient.testIamPermissionsInstanceTemplate(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^InstanceTemplateClient this ^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsInstanceTemplate resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^InstanceTemplateClient this ^com.google.cloud.compute.v1.TestIamPermissionsInstanceTemplateHttpRequest request]
    (-> this (.testIamPermissionsInstanceTemplate request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^InstanceTemplateClient this]
    (-> this (.isTerminated))))

(defn insert-instance-template-callable
  "Creates an instance template in the specified project using the data that is included in the
   request. If you are creating a new template to update an existing instance group, your new
   instance template must use the same network or, if applicable, the same subnetwork as the
   original template.

   Sample code:



   try (InstanceTemplateClient instanceTemplateClient = InstanceTemplateClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     InstanceTemplate instanceTemplateResource = InstanceTemplate.newBuilder().build();
     InsertInstanceTemplateHttpRequest request = InsertInstanceTemplateHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setInstanceTemplateResource(instanceTemplateResource)
       .build();
     ApiFuture<Operation> future = instanceTemplateClient.insertInstanceTemplateCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceTemplateHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceTemplateClient this]
    (-> this (.insertInstanceTemplateCallable))))

(defn shutdown-now
  ""
  ([^InstanceTemplateClient this]
    (-> this (.shutdownNow))))

