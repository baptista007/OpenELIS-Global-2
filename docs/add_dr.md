# Adding Practitioners into FHIRstore

Ensure OE is set to pull pracrittioners from the Consolidated server by setting org.openelisglobal.providerlist.fhirstore=https://cs-path:5000/fhir/


# Step 1 : Set up a Connection Through OpenHIM

Communicate through OpenHIM so you can use HTTP Basic auth to authenticate instead of certs.

Create a client in OpenHIM using the instructions [here](http://openhim.org/docs/configuration/clients).



* Remember your client ID as it will be your username
* Give the client a role that has access to the FHIRstore channel (most likely one of fhir-pusher, fhir-puller, otherwise you will have to add the user to the channel as shown [here](http://openhim.org/docs/configuration/channels))
* Configure authentication with Basic Auth, and keep track of your password

Test that your connection works by navigating to or making a GET request to https://&lt;OpenHIMaddress>:5000/fhir/Practitioner with basic auth properties set.

You should receive a page of the current Practitioner in JSON format.


# Step 2: Generating a UUID 

Because we want to use uuid’s for all our fhir objects, you will need to generate one. There are many generators online such as [https://www.uuidgenerator.net/](https://www.uuidgenerator.net/). It is recommended to use UUID version 4 when generating.


# Step 3: Write your Practitioner in FHIR notation

Below is a template of a FHIR Organization. highlighted fields should be replaced

{

    "resourceType": "Practitioner",

    "id": "generated uuid",

    "identifier": [

   	 {

   		 "system": "http://openelis-global.org/org_regNum",

   		 "value": "regNum"

   	 }

    ],

    "active": true,

    "name": [

   	 {

   		 "family": "familyName",

   		 "given": [

   			 "givenName"

   		 ],

   		 "prefix": [

   			 "Dr"

   		 ]

   	 }

    ],

    "telecom": [

   	 {

   		 "system": "phone"

   	 },

   	 {

   		 "system": "email"

   	 },

   	 {

   		 "system": "fax"

   	 }

    ]

}


# Step 5:

Decide whether you want to add entities one by one, or commit them in one large transaction.


## Step 5a: Add a Single Practitioner to Fhir place

In POSTman:



* select PUT operation
* Set address as the either the FHIR address or the OpenHIM address https://&lt;fhir or OpenHIM address>:&lt;port>/fhir/Practitioner/generated uuid 
* Add Practitioner as the request body 
* set Content-Type header to application/json
* execute the command

Alternatively use the FHIR UI:



* Navigate to https://&lt;fhir or OpenHIM address>:&lt;port>
* select Practitioner on the left hand list
* go to CRUD operation and do an UPDATE (NOT INSERT) 
* Set the id as the generated uuid 
* Execute the command


## Step 5b: Add Organization to Bundle

Template for the bundle is below. The entity in green represents a single entry in the bundle. Multiple entries can be added as a comma delimited list.

{

  "resourceType": "Bundle",

  "id": "bundle-transaction",

  "type": "transaction",

  "entry": [

    {

      "resource": 

	{Practitioner JSON here},

      "request": {

        "method": "PUT",

        "url": "Practitioner/generated uuid"

    }

  }

 ]

}

Once your bundle contains all the entries you want you can execute the transaction bundle

In POSTman:



* select POST operation
* Set address as https://&lt;fhir or OpenHIM address>:&lt;port>/fhir
* Add Bundle as the request body 
* set Content-Type header to application/json
* execute the command
