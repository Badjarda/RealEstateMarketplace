[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/digital-asset/daml/blob/main/LICENSE)

# Decentralized Marketplace for Tokenized Real Estate

## Overview
This repository contains the source code for a **Decentralized Marketplace** designed to facilitate real estate token transactions between authenticated users. The marketplace supports various real estate assets, including:

- Residences
- Garages
- Apartments
- Warehouses
- Lands

Each asset type includes the necessary fields to store detailed information about the property.

## Technology Stack
### **Distributed Ledger Technology (DLT)**
The marketplace is built on **Canton**, a scalable and privacy-enabled distributed ledger technology (DLT). Canton is responsible for:
- Handling **all business logic** securely.
- Maintaining an immutable and **tamper-proof history** of records and transactions.
- Ensuring **data privacy and access control** in a decentralized environment.

### **Smart Contracts and Execution**
The **Daml** smart contract language is used to implement the business logic. These smart contracts execute on **Canton**, ensuring secure and auditable transactions. Daml provides:
- A **safe and expressive** way to define real estate ownership and transactions.
- Built-in **privacy** and **fine-grained permissions**.
- Automatic **consistency and integrity enforcement** in transactions.

## Features
- **Tokenized real estate** transactions between authenticated users.
- **Immutable and auditable** transaction history.
- **Smart contract-driven** asset management.
- **Fine-grained access control** and **privacy** mechanisms.
- **Support for multiple real estate asset types** with structured metadata.

## Installation & Setup
### **Prerequisites**
Ensure you have the following installed:
- [Daml SDK](https://docs.daml.com/getting-started/installation.html)
- [Canton](https://www.canton.io/getting-started/)
- Java (for Canton runtime)
- Docker (for deployment, optional)

### **Setup Instructions**
1. Clone the repository:
```sh
git clone git@github.com:Badjarda/RealEstateMarketplace.git
```
2. Install the dependencies (for that run the following command in the root directory):
```
./scripts/get-dependencies.sh
```
If you are running it on WSL, do these commands
```
> dos2unix ./scripts/get-dependencies.sh
> sed -i 's/\r$//' ./scripts/get-dependencies.sh
> ./scripts/get-dependencies.sh
```
This procedure will download the required Daml packages.

3. Compile and run the project:
```
daml build --all


You need to have [Node.js] and [Daml] installed.

[Node.js]: https://nodejs.dev
[Daml]: https://docs.daml.com

First, start the Daml components:

```bash
daml start
```
This starts a server on `http://localhost:3000`.

See [documentation] for details.

---
### Notes
For more details, visit the official documentation of [Daml](https://docs.daml.com/) and [Canton](https://www.canton.io/).

