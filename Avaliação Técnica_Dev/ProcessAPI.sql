PGDMP  0                    }         
   ProcessAPI    17.4    17.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false            �           1262    16388 
   ProcessAPI    DATABASE     r   CREATE DATABASE "ProcessAPI" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'pt-BR';
    DROP DATABASE "ProcessAPI";
                     postgres    false            �            1259    16389    process    TABLE     f   CREATE TABLE public.process (
    id_process bigint NOT NULL,
    defendant character varying(255)
);
    DROP TABLE public.process;
       public         heap r       postgres    false            �          0    16389    process 
   TABLE DATA           8   COPY public.process (id_process, defendant) FROM stdin;
    public               postgres    false    217   Y       W           2606    16393    process process_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.process
    ADD CONSTRAINT process_pkey PRIMARY KEY (id_process);
 >   ALTER TABLE ONLY public.process DROP CONSTRAINT process_pkey;
       public                 postgres    false    217            �   :   x�32025022�H,���2�p�9�2J�`\N���<��!�obQ��9�\1z\\\ 5g�     