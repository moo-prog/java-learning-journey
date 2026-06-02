# Interface Learnings

* **No Class Keyword:** Interfaces use `interface Name` instead of `class`.
* **Abstract by Default:** Methods inside an interface have no body `{}` and end with `;`. They are automatically abstract.
* **Constants:** Variables inside an interface (like `int a = 10;`) are implicitly `public static final`. Their values cannot be changed later.
* **The implements Keyword:** Classes use `implements InterfaceName` to sign the contract, instead of `extends`.
* **Mandatory Overriding:** Any class that implements an interface must provide the actual code for all of its methods.